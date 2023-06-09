class Solution {
     int res=-1;
    public int longestCycle(int[] edges) {
        int len=edges.length;
        int[] distance=new int[len];
        boolean[] visited=new boolean[len];
        boolean[] extra=new boolean[len];
       
        for (int i=0;i<len;i++) {
           if (visited[i]==false) DFS(i,edges,visited,distance,extra,0);
        }
        return res;
        
        
    }
    void DFS(int node,int[] edges,boolean[] visited,int[] distance,boolean[] extra,int dist){
        if (node!=-1){          

        
        if (visited[node]==false){
            distance[node]=dist;
            visited[node]=true;
            extra[node]=true;
            DFS(edges[node],edges,visited,distance,extra,dist+1); 
            
        }
        else if (extra[node]==true){
      
            res=Math.max(res,dist-distance[node]);
         
            
        }
          extra[node]=false;
        }
        return;
      
        
    }
}