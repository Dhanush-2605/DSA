class Solution {
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        for (int j=1;j<=n;j++){
          int res=Integer.MAX_VALUE;
                for (int i=1;i*i<=j;i++){
            int square=i*i;
            int val=1+dp[j-square];
            res=Math.min(res,val);
        }
        dp[j]=res;          
        }
     return dp[n];   
    }
 

}