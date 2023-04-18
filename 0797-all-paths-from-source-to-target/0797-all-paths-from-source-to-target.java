class Solution {
        List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> cur=new ArrayList<>();
        int n=graph.length;
        boolean[] visited=new boolean[n];        
         DFS(0,cur,graph,n,visited);
    
        return res;
        
    }
    void DFS(int node,List<Integer> cur,int[][] graph,int n,boolean[] visited){
        cur.add(node);
        if (node==n-1){
            res.add(new ArrayList<>(cur));
        }        
        int[] arr=graph[node];
        for(int val:arr){
                DFS(val,cur,graph,n,visited);
                cur.remove(cur.size()-1);
            
        }
        return;
    }
}