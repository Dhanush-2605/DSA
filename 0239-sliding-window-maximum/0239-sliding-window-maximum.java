class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
  
        int n=nums.length;
        int[] res=new int[n-k+1];
        int ind=0;
        
        for (int i=0;i<n;i++){
            if (!dq.isEmpty() && dq.peek()==i-k){
                dq.poll();
                
            }
            
            while (!dq.isEmpty() && nums[i]>nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offer(i);
            
            if (i>=k-1){
                res[ind++]=nums[dq.peek()];
            }
        }

        return res;
        
        
    }
}