class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length-1;
        int[][] dp=new int[n+1][amount+1];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        return recurse(n,coins,amount,dp);
        
    }
    int recurse(int ind,int[] coins,int amount,int[][] dp){
        if (ind==0){
            if (amount%coins[ind]==0) return 1;
            else return 0;
            
        }
        if (amount==0) return 1;
        if (dp[ind][amount]!=-1) return dp[ind][amount];
        
        int notTake=recurse(ind-1,coins,amount,dp);
        int take=0;
        if (amount>=coins[ind]) take=recurse(ind,coins,amount-coins[ind],dp);
        return dp[ind][amount]=take+notTake;
    }
}