class Pair {
    int v;
    int i;

    Pair(int _v, int _i) {
        this.v = _v;
        this.i = _i;
    }
}

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Pair> q = new LinkedList<>();
        for (int j = 0; j < tickets.length; j++) {
            q.add(new Pair(tickets[j], j)); 
        }
        int ctn=0;
        while (q.size()>1){
            Pair p=q.poll();
            int newVal=p.v-1;
            ctn++;
            if (p.i==k && newVal==0) return ctn;
            if (newVal>0){
                q.add(new Pair(newVal,p.i));
            }
            
        }
        if (q.size()==1){
            Pair p=q.poll();
            ctn+=p.v;
        }

        return ctn;
    }
}