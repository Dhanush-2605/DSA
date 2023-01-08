class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int[][] dp=new int[n+1][2];
        for (int[] row:dp) Arrays.fill(row,-1);
        return recurse(0,1,prices,dp,fee);
        
    }
    int recurse(int ind,int buy,int[] prices,int[][] dp,int fee){
        if (ind==prices.length) return 0;
        int profit=0;
        if (dp[ind][buy]!=-1) return dp[ind][buy];
        if (buy==1){
        profit=Math.max(-prices[ind]+recurse(ind+1,0,prices,dp,fee),recurse(ind+1,1,prices,dp,fee));
            
        }else{
            profit=Math.max(prices[ind]+recurse(ind+1,1,prices,dp,fee)-fee,recurse(ind+1,0,prices,dp,fee));
        }
        return dp[ind][buy]=profit;
    }
    
}