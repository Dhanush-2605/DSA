class Solution {
    public int numSquares(int n) {
     int[] dp=new int[n+1];
        for (int num=1;num<=n;num++){
            int res=Integer.MAX_VALUE;
           for (int i=1;i*i<=num;i++){
             int s=i*i;
             int ans=1+dp[num-s];
             res=Math.min(res,ans);
         }      
        dp[num]=res;
        }
       return dp[n];
   
    }

}