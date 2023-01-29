class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        for (int ind=1;ind<=n;ind++){
            int notTake=dp[ind-1];
            int take=Integer.MIN_VALUE;
            if (ind-2<0) take=nums[ind-1]+0;
            else take=nums[ind-1]+dp[ind-2];
            dp[ind]=Math.max(notTake,take);
            
        }
        return dp[nums.length];
        
    }
}