class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for (int val:nums) pq.add(val);
        int res=0;
        for (int i=0;i<k;i++){
            res=pq.poll();
            
        }
        return res;
        
    }
}