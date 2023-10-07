class Solution {
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        dp[1]=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                int c1=(i-j)*j;
                int c2=dp[i-j]*j;
                int temp1=Math.max(c1,c2);
                dp[i]=Math.max(dp[i],temp1);
            }
        }
        
        return dp[n];
        
    }
}