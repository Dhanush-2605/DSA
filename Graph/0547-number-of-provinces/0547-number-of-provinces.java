class Solution {
    public int findCircleNum(int[][] isConnected) {
        int v=isConnected.length;
        boolean[] visited=new boolean[v+1];
        int res=0;
        visited[0]=true;
        for (int i=1;i<=v;i++){
            if (visited[i]==false){
                res++;
                dfs(visited,isConnected,i);
            }
        }
        return res;
        
        
        
    }
    void dfs(boolean[] visited,int[][] isConnected,int node){
        visited[node]=true;
        int len=isConnected[node-1].length;
         for (int i=0;i<len;i++){
             if (isConnected[node-1][i]==1 && visited[i+1]==false) dfs(visited,isConnected,i+1);
            
             
         }
        
    }
}