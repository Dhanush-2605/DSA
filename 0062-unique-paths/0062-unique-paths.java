class Solution {
    private static int ctn=0;
    public int uniquePaths(int m, int n) {
      
        int[][] dp=new int[m][n];
       for (int[] arr:dp) Arrays.fill(arr,-1);
        return back(m,n,0,0,dp);
        // return ctn;       
    }
   static int back(int m,int n,int r,int c,int[][] dp){        
     
        if (r==m-1 && c==n-1){
               return 1;
        }  
        if (dp[r][c]!=-1) return dp[r][c];
        int ls=0;
        int rs=0;
        if (r<m-1) ls=back(m,n,r+1,c,dp);
        if (c<n-1) rs=back(m,n,r,c+1,dp);
         return dp[r][c]=ls+rs;  
    }
}