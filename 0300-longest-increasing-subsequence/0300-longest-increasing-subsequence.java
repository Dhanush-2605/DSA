class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][] dp=new int[n][n];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        return recurse(nums,0,0,dp);
    }
    int recurse(int[] nums,int ind,int prev,int[][] dp){
        if (ind>=nums.length) return 0;
        if (dp[ind][prev]!=-1) return dp[ind][prev];
        int take=Integer.MIN_VALUE;

        if (prev==0 || nums[ind]>nums[prev-1]){
            take=1+recurse(nums,ind+1,ind+1,dp);
        }
        int notTake=0+recurse(nums,ind+1,prev,dp);

        return dp[ind][prev]=Math.max(take,notTake);
    }
}