class Solution{    
public int change(int amount, int[] coins) {
        
        int[][] dp = new int[coins.length][amount+1] ;
    
   for (int i=0;i<coins.length;i++) dp[i][0]=1;
    for (int i=0;i<=amount;i++){
        if (i%coins[0]==0) dp[0][i]=1;
    }
    
    for (int ind=1;ind<coins.length;ind++){
        for (int target=1;target<=amount;target++){
        int notPick = dp[ind-1][target];   
        int pick = 0;
        if(target >= coins[ind]){
            pick = dp[ind][target - coins[ind]];
        }       
         
        dp[ind][target] = pick + notPick;
            
        }
    }
       System.out.println(Arrays.deepToString(dp));
        
        return dp[coins.length-1][amount];
    }
    
    
}