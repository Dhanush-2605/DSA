class Solution {
    public boolean isBipartite(int[][] graph) {
        int l=graph.length;
        int[] color=new int[l];
        Arrays.fill(color,-1);

      for (int i=0;i<graph.length;i++){
          if (color[i]==-1){
              if (checkBipartite(color,graph,i)==false) return false;
          }
      }
      

        return true;
    }
boolean checkBipartite(int[] color,int[][] graph,int node){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);

        color[node]=0;
        while (!q.isEmpty()){
            int curNode=q.peek();
            q.remove();
            int preNode=color[curNode];
            for (int val:graph[curNode]){
                if (color[val]==-1){
                    if (preNode==0) color[val]=1;
                    else color[val]=0;
                    q.add(val);
                    
                }
                else if (preNode==color[val]) return false;
                
            }
        }
    return true;
}
}