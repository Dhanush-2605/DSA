
class UnionFind{
    List<Integer> parent=new ArrayList<>();
    List<Integer> rank=new ArrayList<>();
    int[] res=new int[2];
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
            if (ulp_u==ulp_v){
                res[0]=u;
                res[1]=v;
                return;
            }
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
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        UnionFind ds=new UnionFind(n);
        for (int[] arr:edges){
            ds.union(arr[0],arr[1]);
        }
        return ds.res;
        
        
    }
}