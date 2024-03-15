class Solution {
    public int change(int amount, int[] coins) {
         int[][] dp=new int[coins.length+1][amount+1];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        int ans=recurse(coins,amount,coins.length-1,dp);

        // if (ans==In) return -1;
        return ans;       
    }
    int recurse(int[] coins,int amount,int i,int[][] dp){
        if (amount==0) return 1;
        if (amount<0 || i<0 ) return 0;
        if (dp[i][amount]!=-1) return dp[i][amount];
         int take=0;
        if (amount>=coins[i]){
            take=recurse(coins,amount-coins[i],i,dp);
        }
        int notTake=recurse(coins,amount,i-1,dp);
        
         return dp[i][amount]=take+notTake;


    }
}