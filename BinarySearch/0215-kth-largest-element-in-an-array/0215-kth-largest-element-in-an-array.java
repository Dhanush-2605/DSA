class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->b-a);
        int len=nums.length;
        for (int i=0;i<len;i++){
            q.add(nums[i]);
        }
        int res=-1;
        for (int i=0;i<k;i++) res=q.remove();
        return res;
        
    }
}