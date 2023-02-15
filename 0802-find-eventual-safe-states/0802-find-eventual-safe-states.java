class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res=new ArrayList<>();
        int V=graph.length;
        boolean[] visited=new boolean[V]; 
        boolean[] path=new boolean[V];
        boolean[] check=new boolean[V];
        for (int i=0;i<V;i++){
            if (visited[i]==false) Dfs(graph,visited,path,i,check);
        }
        for (int i=0;i<V;i++){
            if (check[i]==true) res.add(i);
        }
        return res;
    }
    boolean Dfs(int[][] graph,boolean[] visited,boolean[] path,int node,boolean[] check){
        visited[node]=true;
        path[node]=true;
        for (int val:graph[node]){
            if (visited[val]==false){
                if (Dfs(graph,visited,path,val,check)==true) return true;
            }
            else{
                if (path[val]) return true;
            }
        }
        check[node]=true;
        path[node]=false;
        return false;
    }
}