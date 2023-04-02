class UF{
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();
    UF(int n){
        for (int i=0;i<=n;i++){
            parent.add(i);
            size.add(1);
        }
}
    int findUpar(int node){
        if (node==parent.get(node)) return node;
        int cur=findUpar(parent.get(node));
        return cur;
    }
    void unionBySize(int u,int v){
        int ulp_u=findUpar(u);
        int ulp_v=findUpar(v);
        if (ulp_u==ulp_v) return;
        if (size.get(ulp_v)>size.get(ulp_u)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_v)-size.get(ulp_u));
        }
        else{
           parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u)-size.get(ulp_v));
        }
    }
    boolean isConnected(int u,int v){
        return (findUpar(u)==findUpar(v));
    }
}
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        UF ds=new UF(n);
        for (int[] arr:edges){
            ds.unionBySize(arr[0],arr[1]);
            
        }
       if (ds.isConnected(source,destination)==false) return false;
        return true;
        
    }
}