class Solution {
    public int minPathSum(int[][] grid) {
        int r=grid.length-1;
        int col=grid[0].length-1;
        int[][] dp=new int[r+1][col+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        return recurse(r,col,grid,dp);
        
    }
    int recurse(int r,int c,int[][] grid,int[][] dp){
        if (r==0 && c==0) return grid[r][c];
        if (r<0 || c<0) return 100000;
        if (dp[r][c]!=-1) return dp[r][c];
        int top=grid[r][c]+recurse(r-1,c,grid,dp);
        int left=grid[r][c]+recurse(r,c-1,grid,dp);
        return dp[r][c]=Math.min(top,left);
    }
}