class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i=0;i<numCourses;i++){
            ArrayList<Integer> l=new ArrayList<>();
            adj.add(l);
        }
        for (int[] val:prerequisites){
            adj.get(val[1]).add(val[0]);
        }
        int V=adj.size();
        boolean[] visited=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        int[] inDeg=new int[V];
        for (int i=0;i<V;i++){
        for (int val:adj.get(i)){
            inDeg[val]++;
        }
    }
        for (int i=0;i<V;i++){
            if (inDeg[i]==0) q.add(i);
        }
    
    int ind=0;
    while (!q.isEmpty()){
        int curNode=q.poll();
        if (inDeg[curNode]==0){
                ind++;
                
            }
        for (int val:adj.get(curNode)){
           inDeg[val]--;
           if (inDeg[val]==0) q.add(val);
        }
    }
    if (ind==numCourses) return true;
 
        return false;
        
        
    }
}