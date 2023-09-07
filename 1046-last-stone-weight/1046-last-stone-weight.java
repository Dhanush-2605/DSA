class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for (int val:stones){
            pq.add(val);
        }
        while (pq.size()>1){
            int f=pq.poll();
            int s=pq.poll();
            pq.add(f-s);
        }
        return pq.poll();
        
    }
}