class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp=new int[prices.length][2];
        for (int[] row:dp) Arrays.fill(row,-1);
        return recurse(0,1,prices,dp);
    }
    int recurse(int ind,int buy,int[] prices,int[][] dp){
        if (ind>=prices.length) return 0;
        if (dp[ind][buy]!=-1) return dp[ind][buy];
        int profit=0;
        if (buy==1){
            profit=Math.max(-prices[ind]+recurse(ind+1,0,prices,dp),recurse(ind+1,1,prices,dp));
        }else{
            profit=Math.max(prices[ind]+recurse(ind+2,1,prices,dp),recurse(ind+1,0,prices,dp));
            
        }
        return dp[ind][buy]=profit;
    }
}