class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> res=new ArrayList<>();
        List<List<Integer>> adj=new ArrayList<>();
        for (int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            res.add(new ArrayList<>());
        }
        for (int[] arr:edges){
            adj.get(arr[0]).add(arr[1]);
        }
        for (int i=0;i<n;i++){
            int ancestor=i;
            DFS(i,ancestor,adj,res);
        }
        return res;
        
    }
    void DFS(int node,int ancestor,List<List<Integer>> adj,List<List<Integer>> res){

        List<Integer> ancesList=res.get(node);
    if (ancesList.isEmpty() || ancesList.get(ancesList.size()-1)!=ancestor){
                if (ancestor!=node) ancesList.add(ancestor);
              for (int val:adj.get(node)){
                 DFS(val,ancestor,adj,res);     
        }              
                
            }
     

    }
}