class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> inorder=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        for (int i=0;i<n;i++) inorder.add(0);
        boolean[] visited=new boolean[n];
        List<List<Integer>> adj=new ArrayList<>();
        for (int i=0;i<n;i++){
            List<Integer> cur=new ArrayList<>();
            adj.add(cur);
        }
        for (List<Integer> arr:edges){
            adj.get(arr.get(0)).add(arr.get(1));
            
        }
        for (int i=0;i<n;i++){
            if (visited[i]==false) DFS(i,inorder,adj,visited);
        }
        for (int i=0;i<n;i++){
            if (inorder.get(i)==0) res.add(i);
        }
        return res;
        
    }
    void DFS(int node,List<Integer> inorder,List<List<Integer>> adj,boolean[] visited){
        List<Integer> cur=adj.get(node);
        visited[node]=true;
        for (int val:cur){
            inorder.set(val,inorder.get(val)+1);
            if (visited[val]==false) DFS(val,inorder,adj,visited);
        }
        return;
        
    }
}