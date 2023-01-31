class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
       int[][] dp=new int[n][amount+1];
        for (int[] rows:dp) Arrays.fill(rows,-1);
        int ans=recurse(n-1,coins,amount,dp);
        if (ans==(int)Math.pow(10,9)) return -1;
        return ans;
    }
    int recurse(int ind,int[] coins,int amount,int[][] dp){
        if (ind==0){
            if (amount%coins[ind]==0) return amount/coins[ind];
             return (int)Math.pow(10,9);
            
        }
        if (dp[ind][amount]!=-1) return dp[ind][amount];
        int notTake=recurse(ind-1,coins,amount,dp);
        int take=Integer.MAX_VALUE;
        if (amount>=coins[ind]) take=1+recurse(ind,coins,amount-coins[ind],dp);
        return dp[ind][amount]=Math.min(notTake,take);
    }
}