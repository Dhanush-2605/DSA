class Solution {
    public int numSquares(int n) {
     int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
       return recurse(n,dp);
   
    }
    
     int recurse(int n,int[] dp){
         if(n==0) return 0;
         if (dp[n]!=-1) return dp[n];
         int res=Integer.MAX_VALUE;
         for (int i=1;i*i<=n;i++){
             int s=i*i;
             int ans=1+recurse(n-s,dp);
             res=Math.min(res,ans);
         }
         dp[n]=res;
         return res;
         
     }
}