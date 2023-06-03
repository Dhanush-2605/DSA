class UnionFind{
    List<Integer> rank=new ArrayList<>();
    List<Integer> parent=new ArrayList<>();
    public UnionFind(int n){
        for (int i=0;i<=n;i++){
            parent.add(i);
            rank.add(0);
        }
        
    }
    int findUpar(int node){
        if (node==parent.get(node)) return node;
        int ulp=findUpar(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
        
        
        
    }
    void unionByRank(int u,int v){
        int ulp_u=findUpar(u);
        int ulp_v=findUpar(v);
        
        if (ulp_u==ulp_v) return;
        
        if (rank.get(ulp_u)<rank.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
        }
        else if(rank.get(ulp_u)>rank.get(ulp_v)){
            parent.set(ulp_v,ulp_u);
        }
        else{
            parent.set(ulp_u,ulp_v);
            rank.set(ulp_u,rank.get(ulp_u)+1);
        }
    
        
        
    }
}

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        UnionFind ds=new UnionFind(n);
        int r=isConnected.length;
        int c=isConnected[0].length;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (isConnected[i][j]==1){
                    ds.unionByRank(i+1,j+1);
                }
            }
        }
        int ctn=0;
        for(int i=1;i<=n;i++){
            if (ds.findUpar(i)==i) ctn++;
        }
        return ctn;
    }
}