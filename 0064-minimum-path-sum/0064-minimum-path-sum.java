class Solution {
    public int minPathSum(int[][] grid) {
        int row=grid.length-1;
        int col=grid[0].length-1;
        int[][] dp=new int[row+1][col+1];      
        for (int r=0;r<row+1;r++){
            for (int c=0;c<col+1;c++){
                if (r==0 && c==0) dp[0][0]=grid[0][0];
                else{
                int top=0;
                int left=0;
                if (r>0) top=grid[r][c]+dp[r-1][c];
                else top=1000000;
                if (c>0) left=grid[r][c]+dp[r][c-1];
                else left=1000000;
                        
dp[r][c]=Math.min(top,left);
                }
            }
        }
        
        
        return dp[row][col];
        
    }
    // int recurse(int r,int c,int[][] grid,int[][] dp){
    //     if (r==0 && c==0) return grid[r][c];
    //     if (r<0 || c<0) return 100000;
    //     if (dp[r][c]!=-1) return dp[r][c];
    //     int top=grid[r][c]+recurse(r-1,c,grid,dp);
    //     int left=grid[r][c]+recurse(r,c-1,grid,dp);
    //     return dp[r][c]=Math.min(top,left);
    // }
}