class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        // return recurse(m-1,n-1,arr); 
        
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i==0 && j==0) dp[i][j]=1;
                else {
                int r=0;
                int b=0;
                if (i>0) r=dp[i-1][j];
                if (j>0) b=dp[i][j-1];
                dp[i][j]=r+b;
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[m-1][n-1];

}
  
   
    
}