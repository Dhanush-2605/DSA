class UFD{
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();
    UFD(int n){
        for (int i=0;i<=n;i++){
            parent.add(i);
            size.add(1);
        }
    }
    int findUpar(int node){
        if (node==parent.get(node)) return node;
        int ulp=findUpar(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
        
    }
    void unionBySize(int u,int v){
        int ulp_u=findUpar(u);
        int ulp_v=findUpar(v);
        if (ulp_v==ulp_u) return;
        if (size.get(ulp_v)>size.get(ulp_u)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_v)-size.get(ulp_u));
        }else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u)-size.get(ulp_v));      
        }
    }
    boolean isConnected(int u,int v){
        return (findUpar(u)==findUpar(v));
    }
}
    


class Solution {
    public int minCostConnectPoints(int[][] points) {
        int len=points.length;
       
        PriorityQueue<ArrayList<Integer>> pq=new PriorityQueue<>((a,b)->a.get(2)-b.get(2));
        
        for (int i=0;i<len;i++){
            for (int j=i+1;j<len;j++){
     int distance=Math.abs(points[i][0] - points[j][0] ) + 
                    Math.abs(points[i][1] - points[j][1]);
                ArrayList<Integer> cur=new ArrayList<>();
                cur.add(i);
                cur.add(j);
                cur.add(distance);
                pq.add(cur);
                
                
            }
        }
        // for (int i=0;i<len;i++){
        // System.out.println(pq.poll());
        // }
        UFD ds=new UFD(len);
        int res=0;
        int count=len-1;
        while (pq.size()>0 && count>0){
            ArrayList<Integer> cur=pq.poll();
            if (!ds.isConnected(cur.get(0),cur.get(1))){
                ds.unionBySize(cur.get(0),cur.get(1));
                res+=cur.get(2);
                count--;
                
                
            }
        }
        return res;
    }
}