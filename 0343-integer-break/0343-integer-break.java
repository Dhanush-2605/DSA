class Solution {
    public int integerBreak(int n) {
        if (n==2 || n==3)return n-1;
        int[][] dp=new int[n][n+1];
        for (int[] row:dp) Arrays.fill(row,-1);
        return recurse(n-1,n,dp);
        
    }
    int recurse(int ind,int target,int[][] dp){
        if (target==0) return 0;
        if (ind==1){
            if (target>=ind) return target;
        }
        if (dp[ind][target]!=-1) return dp[ind][target];
        int unTake=recurse(ind-1,target,dp);
        int take=0;
        if(target>=ind) take=ind*recurse(ind,target-ind,dp);
        dp[ind][target]=Math.max(take,unTake);
        return Math.max(take,unTake);
        
    }
}