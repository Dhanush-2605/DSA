class Solution {
        // List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        for (int i=0;i<n;i++){
            List<Integer> cur=new ArrayList<>();
            adj.add(new ArrayList<>());
            res.add(new ArrayList<>());
        }                  
        for (int[] arr:edges){
            adj.get(arr[0]).add(arr[1]);            
        }    
        for (int i=0;i<n;i++){
            int ancestor=i;
            DFS(adj,ancestor,i,res);
            
        }       
 
        return res;
        
    }
    
    void DFS(List<List<Integer>> adj,int ancestor,int src,List<List<Integer>> res){
       
        List<Integer> ancestorList=res.get(src);
        if (ancestorList.isEmpty()|| ancestorList.get(ancestorList.size()-1)!=ancestor){
            if (ancestor!=src) ancestorList.add(ancestor);
            for (int val:adj.get(src)){
                DFS(adj,ancestor,val,res);
            }
        }
        // return;
        
    }
    
}