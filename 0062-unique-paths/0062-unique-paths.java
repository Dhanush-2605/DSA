class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr=new int[m][n];
        return recurse(m-1,n-1,arr); 

}
   static int recurse(int r,int c,int[][] dp){ 
        if (r==0 && c==0) return 1;
             
        if (r<0 || c<0) return 0;
        if (dp[r][c]!=0) return dp[r][c];
        int t=recurse(r-1,c,dp);
        int l=recurse(r,c-1,dp);
        dp[r][c]=t+l;
        return t+l;
     
    }
   
    
}