class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int mod=1000000000+7;
        for (int val:nums) pq.add(val);
        for (int i=0;i<k;i++){
            int top=pq.peek();
             pq.poll();
            top++;
            pq.add(top);
           
        }
        long res=1;
        while (!pq.isEmpty()){
            res=(res*pq.peek())%mod;
            pq.poll();
        }
        return (int)res;
    }
}