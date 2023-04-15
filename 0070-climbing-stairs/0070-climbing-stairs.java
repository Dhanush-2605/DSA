class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        if (n==1 || n==2) return n;
        dp[1]=1;
        dp[2]=2;
        for (int i=3;i<=n;i++){
            int one=dp[i-1];
            int two=dp[i-2];
           dp[i]=one+two;   
        }
        return dp[n];
    }

}