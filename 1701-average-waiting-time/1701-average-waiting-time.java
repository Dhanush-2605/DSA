class Solution {
    public double averageWaitingTime(int[][] customers) {
        int prevsum=0;
        int prevEnd=customers[0][1];
        int n=customers.length;
        double sum=0;
        for (int i=0;i<n;i++){
            if (customers[i][0]>=prevsum){
                int temp=customers[i][0]+customers[i][1];
                sum+=(temp-customers[i][0]);
                prevsum=customers[i][0]+customers[i][1];

            }
            else
            {
            int cur=customers[i][1]+prevsum;
            sum+=(cur-customers[i][0]);
            prevsum=cur;
            }
        }
        // double res=(sum)/(double)n;
        return sum/n;
        
    }
}