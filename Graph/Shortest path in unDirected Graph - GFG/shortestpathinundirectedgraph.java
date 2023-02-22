
class Pair{
    int n;
    int d;
    Pair(int _a,int _b){
        this.n=_a;
        this.d=_b;
    }
}
class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
     ArrayList<ArrayList<Integer>>  adj=new ArrayList<>();
     for (int i=0;i<n;i++){
         ArrayList<Integer> cur=new ArrayList<>();
         adj.add(cur);
     }
     for (int[] arr:edges){
         adj.get(arr[0]).add(arr[1]);
         adj.get(arr[1]).add(arr[0]);
     }
     Queue<Pair> q=new LinkedList<>();
     q.add(new Pair(src,0));
     int[] dist=new int[n];
     Arrays.fill(dist,10000000);
     dist[src]=0;
     while (!q.isEmpty()){
         int top=q.peek().n;
         int d=q.peek().d;
         q.poll();
         for(int val:adj.get(top)){
             if (d+1<dist[val]){
                 dist[val]=d+1;
                 q.add(new Pair(val,dist[val]));
            }
             
         }
     }
     for (int i=0;i<n;i++){
         if (dist[i]==10000000) dist[i]=-1;
     }
     return dist;
    }
}