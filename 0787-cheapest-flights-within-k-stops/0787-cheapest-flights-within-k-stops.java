class Pair{
    int n;
    int w;
    int d;
    Pair(int _n,int _w,int _d){
        this.n=_n;
        this.w=_w;
        this.d=_d;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<List<Integer>>> res=new ArrayList<>();
        for (int i=0;i<n;i++){
            List<List<Integer>> temp=new ArrayList<>();
            res.add(temp);
        }
        for (int[] flight:flights){
            List<Integer> cur=new ArrayList<>();
            cur.add(flight[1]);
            cur.add(flight[2]);
            res.get(flight[0]).add(cur);
        }
        int[] dis=new int[n];
        dis[src]=0;
        Arrays.fill(dis,Integer.MAX_VALUE);
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src,0,0));
        while (!q.isEmpty()){
            int n1=q.peek().n;
            int w1=q.peek().w;
            int d1=q.peek().d;
            q.remove();
            if (w1>k) continue;
            List<List<Integer>> cur=res.get(n1);
            for (List<Integer> arr:cur){
                int pN=arr.get(0);
                int pD=arr.get(1);
                if (d1+pD<dis[pN] && w1<=k){
                    dis[pN]=d1+pD;
             q.add(new Pair(pN,w1+1,d1+pD));
                }
                // if (w1<k)

            }
        }
        if (dis[dst]==Integer.MAX_VALUE) return -1;
        return dis[dst];
        
    }
}