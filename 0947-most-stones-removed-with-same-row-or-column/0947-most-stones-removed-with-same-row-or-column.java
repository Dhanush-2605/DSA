
class UnionFind{
    List<Integer> parent=new ArrayList<>();
    List<Integer> rank=new ArrayList<>();
    int c;
    int n;
    UnionFind(int n){
        for (int i=0;i<=n;i++){
            parent.add(i);
            rank.add(0);            
        }
    }
        public int findUpar(int node){
            if (node==parent.get(node)) return node;
            int ulp=findUpar(parent.get(node));
            parent.set(node,ulp);
            return parent.get(node);
        }
        
        void union(int u,int v){
            int ulp_u=findUpar(u);
            int ulp_v=findUpar(v);
            if (ulp_u==ulp_v) return;
            if (rank.get(ulp_u)>rank.get(ulp_v)){
                parent.set(ulp_v,ulp_u);
            }
            else if (rank.get(ulp_v)>rank.get(ulp_u)){
                parent.set(ulp_u,ulp_v);
            }
            else{
                rank.set(ulp_u,rank.get(ulp_u)+1);
                parent.set(ulp_v,ulp_u);
                c++;
            }
        }
    }

class Solution {
    public int removeStones(int[][] stones) {
        int n=stones.length;
        // List<List<Integer>> adj=new ArrayList<>();
        int maxR=0;
        int maxC=0;
        for (int[] arr:stones){            
             maxR=Math.max(maxR,arr[0]);
             maxC=Math.max(maxC,arr[1]);            
        }
        // System.out.println(maxR +" "+maxC);
        UnionFind ds=new UnionFind(maxR+maxC+1);
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int[] arr:stones){
            int nodeR=arr[0];
            int nodeC=arr[1]+maxR+1;            
            ds.union(nodeR,nodeC);
            map.put(nodeR,1);
            map.put(nodeC,1);            
        }
        

        // System.out.println(ds.parent);
        int ctn=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (ds.findUpar(entry.getKey())==entry.getKey()) ctn++;
        }

        return n-ctn;
        
    }
}