class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int l=prerequisites.length;
        for (int i=0;i<numCourses;i++){
            ArrayList<Integer> li=new ArrayList<>();
            adj.add(li);
        } 
        for (int[] val:prerequisites){
            adj.get(val[1]).add(val[0]);            
        }
        int V=adj.size();
        boolean[] visited=new boolean[V];
        int[] inDegree=new int[V];
        for (int i=0;i<V;i++){
            for (int val:adj.get(i)){
                inDegree[val]++;
            }
        }
        for (int i=0;i<V;i++){
            if (inDegree[i]==0){
                q.add(i);
            }
        }
        int ind=0;
        while (!q.isEmpty()){
            int cur=q.poll();
            visited[cur]=true;
            if (inDegree[cur]==0){
                res.add(cur);
                
            }
            for (int val:adj.get(cur)){
                inDegree[val]--;                
               if (inDegree[val]==0) q.add(val);
                
                
                
            }
        }
         int[] ans1={};
         if (res.size()==V){
             int[] ans=new int[res.size()];
             for (int i=0;i<res.size();i++) ans[i]=res.get(i);
             return ans;
         }
        return ans1;
        
    }
}