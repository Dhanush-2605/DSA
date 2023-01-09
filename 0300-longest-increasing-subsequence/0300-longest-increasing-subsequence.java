class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n+1];
        for (int[] row:dp) Arrays.fill(row,-1);
        return recurse(0,0,nums,dp);
    }
    int recurse(int ind,int prev,int[] nums,int[][] dp){
        if (ind==nums.length) return 0;
        if (dp[ind][prev]!=-1) return dp[ind][prev];
        int unTake=recurse(ind+1,prev,nums,dp);
        int take=Integer.MIN_VALUE;
        if (prev==0 || nums[ind]>nums[prev-1]){
            take=1+recurse(ind+1,ind+1,nums,dp);
        }
        return dp[ind][prev]=Math.max(take,unTake);

    }
}