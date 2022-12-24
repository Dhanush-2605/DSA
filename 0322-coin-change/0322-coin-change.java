
// TC-> MORE THAN 2 POWER N;
// SC -> MORE THAN N
class Solution {
    public int coinChange(int[] coins, int amount) {

        int[][] dp=new int[coins.length][amount+1];
     for(int row[]: dp)
      Arrays.fill(row,-1);
        int ans=recurse(coins.length-1,amount,coins,dp);
          if(ans >= (int)Math.pow(10,9)) return -1;
    return ans;
        
    }
    int recurse(int ind,int target,int[] coins,int[][] dp){
        if (ind==0){
            if (target%coins[ind]==0) return target/coins[ind];
            else return (int)Math.pow(10,9);
            
        }
        if (dp[ind][target]!=-1) return dp[ind][target];
        int unTake=0+recurse(ind-1,target,coins,dp);
        int take=(int)Math.pow(10,9);
        if (target>=coins[ind]) take=1+recurse(ind,target-coins[ind],coins,dp);
        dp[ind][target]=Math.min(take,unTake);
        return Math.min(take,unTake);
    }
}