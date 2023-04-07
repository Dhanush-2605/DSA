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
 
}

class Solution {
    public int makeConnected(int n, int[][] connections) {
        UFD ds=new UFD(n);
        int ctn=0;
        for (int[] arr:connections){
            if (ds.findUpar(arr[0])==ds.findUpar(arr[1])) ctn++;
            else ds.unionBySize(arr[0],arr[1]);
        }
      
        int c=0;
        for (int i=0;i<n;i++){
            if (ds.parent.get(i)==i) c++;
        }
          if (ctn>=c-1) return c-1;
        return -1;
    }

}