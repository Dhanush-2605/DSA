class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n+1][n+1];
        for (int ind=n-1;ind>=0;ind--){
            for (int prev=n;prev>=0;prev--){
        int unTake=dp[ind+1][prev];
        int take=Integer.MIN_VALUE;
        if (prev==0 || nums[ind]>nums[prev-1]){
            take=1+dp[ind+1][ind+1];
        }
         dp[ind][prev]=Math.max(take,unTake);
                
            }
        }
        return dp[0][0];
    }

}