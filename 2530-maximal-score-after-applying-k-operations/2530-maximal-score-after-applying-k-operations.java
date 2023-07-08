class Solution {
    public long maxKelements(int[] nums, int k) {
        long res=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for (int val:nums) pq.add(val);
        for (int i=0;i<k;i++){
            int num=pq.peek();
            res+=pq.poll();
            pq.add((int)Math.ceil((double)num/3));
        }
        return res;
        
    }
}