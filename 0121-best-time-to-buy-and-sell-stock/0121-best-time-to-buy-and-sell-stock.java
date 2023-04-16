class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int sum=0;
        for (int i=1;i<prices.length;i++){
            int dif=prices[i]-min;
            if (dif<0) min=prices[i];
            sum=Math.max(sum,dif);
        }
        return sum;
        
        
    }
}