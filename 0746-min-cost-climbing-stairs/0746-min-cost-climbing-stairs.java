class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(recurse(0,cost,dp),recurse(1,cost,dp));
    }
    int recurse(int ind,int[] cost,int[] dp){

        if (ind>=cost.length) return 0;
        if (dp[ind]!=-1) return dp[ind];
        int s1=recurse(ind+1,cost,dp);
        int s2=recurse(ind+2,cost,dp);
       
        return dp[ind]=cost[ind]+Math.min(s1,s2);
    }
}