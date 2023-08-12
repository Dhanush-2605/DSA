class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length;
        int c=obstacleGrid[0].length;
        int[][] dp=new int[r][c];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        
        return recurse(0,0,obstacleGrid,r-1,c-1,dp);
        
    }
    int recurse(int r,int c,int[][] obstacleGrid,int m,int n,int[][] dp){
        if (r==m && c==n && obstacleGrid[r][c]!=1) return 1;
        if (r<0 || c<0 || r>m || c>n || obstacleGrid[r][c]==1 ) return 0;
        if (dp[r][c]!=-1) return dp[r][c];
        
        int bottom=recurse(r+1,c,obstacleGrid,m,n,dp);
        int right=recurse(r,c+1,obstacleGrid,m,n,dp);
        return dp[r][c]=right+bottom;
        
        
    }
}