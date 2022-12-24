
// TC-> MORE THAN 2 POWER N;
// SC -> MORE THAN N
class Solution {
    public int coinChange(int[] coins, int amount) {

        int[][] dp=new int[coins.length][amount+1];
        for (int i=0;i<=amount;i++){
            if (i%coins[0]==0){

            dp[0][i]=i/coins[0];
            }
            else dp[0][i]=(int)Math.pow(10,9);
        };
        
        
        
        for (int ind=1;ind<coins.length;ind++){
            for (int target=0;target<=amount;target++){
           int unTake=0+dp[ind-1][target];
           int take=(int)Math.pow(10,9);
            if (target>=coins[ind]) take=1+dp[ind][target-coins[ind]];
            dp[ind][target]=Math.min(take,unTake);             
            }
        }
        int res=dp[coins.length-1][amount];
        System.out.println(res);
        if (res>=(int)Math.pow(10,9)) return -1;
        else return res;
        
    }

}