class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

       int row=obstacleGrid.length;
       int col=obstacleGrid[0].length;
        int[][] dp =new int[row][col];


       return recurse(obstacleGrid,dp,row-1,col-1);
    }
    int recurse(int[][] grid,int[][] dp,int r,int c){
      if (r>=0 && c>=0 && grid[r][c]==1) return 0;
        if(r==0 && c==0) return 1;
        if (r<0 || c<0) return 0;
        if (dp[r][c]!=0) return dp[r][c];
   
        
     
        int l=recurse(grid,dp,r-1,c);
        int m=recurse(grid,dp,r,c-1);
        dp[r][c]=l+m;
        return l+m;
    }

}