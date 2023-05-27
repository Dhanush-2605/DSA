class Pair{
    int n;
    int d;
    Pair(int _n,int _d){
        this.n=_n;
        this.d=_d;
     
        }
}
class Solution {
    public int countPaths(int e, int[][] roads) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.d-b.d);
    ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        for (int i=0;i<e;i++){
            ArrayList<Pair> temp=new ArrayList<>();
            adj.add(temp);
        }
        for (int[] arr:roads){
            adj.get(arr[0]).add(new Pair(arr[1],arr[2]));
            adj.get(arr[1]).add(new Pair(arr[0],arr[2]));

        }
        int[] dist=new int[e];
        int[] ways=new int[e];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        ways[0]=1;
        pq.add(new Pair(0,0));
        int mod=(int)(Math.pow(10,9)+7);
        while (!pq.isEmpty()){
            int n=pq.peek().n;
            int d=pq.peek().d;
            pq.remove();
            ArrayList<Pair> temp=adj.get(n);
            for (Pair p:temp){
                int nD=d+p.d;
                if (dist[p.n]>nD){
                    dist[p.n]=nD;
                    ways[p.n]=ways[n];
                    pq.add(new Pair(p.n,nD));
                }
                else if (dist[p.n]==nD){
                    ways[p.n]=(ways[p.n]+ways[n])%mod;
                }
            }
        }
        return ways[e-1];
        
    }
}