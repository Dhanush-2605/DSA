class Solution{    
public int change(int amount, int[] coins) {
        
        int[][] dp = new int[coins.length][amount+1] ;
        for(int i=0 ; i<coins.length ; i++){
            Arrays.fill ( dp[i] , -1);
        }
        
        return helper(coins , amount , coins.length-1 , dp);
    }
    
    private int helper(int[] coins , int amount, int i , int[][] dp) {
        if(amount == 0) return 1;
        
        if(i == 0){
            if(amount % coins[0] == 0) return 1;
            else return 0;
        } 
        
        if(dp[i][amount] != -1) return dp[i][amount];
        
        int pick = 0;
        if(amount >= coins[i]){
            pick = helper(coins , amount - coins[i] , i , dp);
        }
        
        int notPick = helper(coins , amount , i-1 , dp);
        
        dp[i][amount] = pick + notPick;
        
        return dp[i][amount];
    }
}