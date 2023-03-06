class Pair{
    int a;
    int b;
    Pair(int _a,int _b){
        this.a=_a;
        this.b=_b;
    }
}
class Solution {
    public int countPaths(int n, int[][] roads) {
        int len=roads.length;
        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>((c,d)->c.b-d.b);
        for (int i=0;i<n;i++){
            ArrayList<Pair> cur=new ArrayList<>();
            adj.add(cur);
        }
        for (int i=0;i<len;i++){
            
            adj.get(roads[i][0]).add(new Pair(roads[i][1],roads[i][2]));
            adj.get(roads[i][1]).add(new Pair(roads[i][0],roads[i][2]));

        }
        int[] dist=new int[n];
        int[] ways=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        int mod=(int)(Math.pow(10,9) + 7);
        pq.add(new Pair(0,0));
        dist[0]=0;
        ways[0]=1;
        while (!pq.isEmpty()){
         int curNode=pq.peek().a;
         int curDis=pq.peek().b;
            pq.remove();
         ArrayList<Pair> list=adj.get(curNode);
        for (Pair p:list){
            int newNode=p.a;
            int newDis=p.b;
        
            if (curDis+newDis<dist[newNode]){
                dist[newNode]=curDis+newDis;
                ways[newNode]=ways[curNode];
                pq.add(new Pair(newNode,curDis+newDis));
            }
            else if (curDis+newDis==dist[newNode]){
                ways[newNode]=(ways[curNode]+ways[newNode])%mod;
            }
        }
        }
        return ways[n-1];
    }
}