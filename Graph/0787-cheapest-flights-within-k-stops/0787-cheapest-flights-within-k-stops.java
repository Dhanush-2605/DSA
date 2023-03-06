class Pair{
    int n;
    int d;
    int c;
    Pair (int _n,int _d,int _c){
        this.n=_n;
        this.d=_d;
        this.c=_c;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj=new ArrayList<>();
        for (int i=0;i<n;i++){
            ArrayList<ArrayList<Integer>> cur=new ArrayList<>();
            adj.add(cur);
        }
        for (int[] arr:flights){
            ArrayList<Integer> cur=new ArrayList<>();
            cur.add(arr[1]);
            cur.add(arr[2]);
            adj.get(arr[0]).add(cur);
            
        }
        int res=Integer.MAX_VALUE;
        Queue<Pair> pq=new LinkedList<>();
        pq.add(new Pair(src,0,0));
        int[] distance=new int[n];
        Arrays.fill(distance,Integer.MAX_VALUE);

        while (!pq.isEmpty()){
            int no=pq.peek().n;
            int d=pq.peek().d;
            int c=pq.peek().c;
            pq.remove();
            ArrayList<ArrayList<Integer>> curNode=adj.get(no);
            
            if (c>k) continue;
            for (ArrayList<Integer> l:curNode){
                
                int newNode=l.get(0);
                int totDis=d+l.get(1);
                if (totDis<distance[newNode] && c<=k){               
                    pq.add(new Pair(newNode,totDis,c+1));
                    distance[newNode]=totDis;
                }
            
            }
        }
        if (distance[dst]==Integer.MAX_VALUE) return -1;
        

        return distance[dst];
        
    }
}