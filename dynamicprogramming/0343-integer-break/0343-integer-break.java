class Solution {
    public int integerBreak(int n) {
        if (n==2 || n==3)return n-1;
        int[][] dp=new int[n][n+1];
        for (int i=1;i<=n;i++) dp[1][i]=i;
        for (int ind=2;ind<n;ind++){
            for (int target=1;target<=n;target++){
              int unTake=dp[ind-1][target];
              int take=0;
            if(target>=ind) take=ind*dp[ind][target-ind];  
            dp[ind][target]=Math.max(take,unTake);           
            }
            
        }
        return dp[n-1][n];
        
    }

}