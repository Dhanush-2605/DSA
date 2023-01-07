class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for (int i=1;i<prices.length;i++){
            int diff=prices[i]-min;
            if (diff<0){
                min=prices[i];
            }
            else{
                if (diff>profit) profit=diff;
            }
            
        }
        return profit;
        
        
    }
}