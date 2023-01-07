class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length+1][2];
        int len=prices.length;
        dp[len][0]=0;
        dp[len][1]=0;
        for (int ind=len-1;ind>=0;ind--){
              for (int buy=0;buy<=1;buy++){
             int profit=0;
             if (buy==1){
                 profit=Math.max(-prices[ind]+dp[ind+1][0],dp[ind+1][1]);
             }
            else{
                profit=Math.max(prices[ind]+dp[ind+1][1],dp[ind+1][0]);
        }
         dp[ind][buy]=profit;
                
            }
        }
        return dp[0][1];
        
    }

}