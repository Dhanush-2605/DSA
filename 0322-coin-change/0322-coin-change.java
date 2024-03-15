class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length+1][amount+1];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        int ans=recurse(coins,amount,coins.length-1,dp);

        if (ans==Integer.MAX_VALUE-1) return -1;
        return ans;
    }
    int recurse(int[] coins,int amount,int i,int[][] dp){
        if (amount==0) return 0;
        if (amount<0 || i<0 ) return Integer.MAX_VALUE-1;
        if (dp[i][amount]!=-1) return dp[i][amount];
         int take=Integer.MAX_VALUE-1;
        if (amount>=coins[i]){
            take=1+recurse(coins,amount-coins[i],i,dp);
        }
        int notTake=recurse(coins,amount,i-1,dp);
        
         return dp[i][amount]=Math.min(take,notTake);


    }
}