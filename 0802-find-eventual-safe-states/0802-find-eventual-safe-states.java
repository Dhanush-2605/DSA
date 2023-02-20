class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int V=graph.length;
    for (int i=0;i<V;i++){
        ArrayList<Integer> l=new ArrayList<>();
        adj.add(l);
    }
        for (int i=0;i<V;i++){
            for (int val:graph[i]){
                adj.get(val).add(i);
            }
        }
        int[] inDegree=new int[V];
        for (int i=0;i<V;i++){
            for (int val:adj.get(i)) inDegree[val]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for (int i=0;i<V;i++){
          if (inDegree[i]==0) q.add(i);
    }   
        List<Integer> res=new ArrayList<>();
        while (!q.isEmpty()){
            int cur=q.poll();
            if (inDegree[cur]==0) res.add(cur);
            for (int val:adj.get(cur)){
                inDegree[val]--;
                if (inDegree[val]==0) q.add(val);
            }
        }
        Collections.sort(res);
        return res;
    }
}