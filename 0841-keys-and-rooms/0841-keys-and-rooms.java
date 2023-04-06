class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {     
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        List<Integer> l=rooms.get(0);
        int c=0;
        for (int i=0;i<l.size();i++){
            if (visited[i]==false){
            DFS(rooms,i,visited);
            c++;
            }
        }
       
        for (boolean val:visited){
            if (val==false || c>1) return false;
        }
return true;

        
                    
    }
    void DFS(List<List<Integer>> adj,int node,boolean[] visited){
        visited[node]=true;
        List<Integer> cur=adj.get(node);
        for (int val:cur){
            if (visited[val]==false){
            DFS(adj,val,visited);
            }
        }
        return;

    }
}