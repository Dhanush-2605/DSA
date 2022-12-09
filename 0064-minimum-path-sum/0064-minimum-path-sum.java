class Solution {    
    int[][] matrix;
        
    public int minPathSum(int[][] grid) {
        matrix = grid;        
        if(grid.length == 0 || grid[0].length == 0) return 0;        
        int[][] dp=new int[grid.length][grid[0].length];
        return path(0,0,dp);
        
    }
    
    private int path(int i, int j,int[][] dp) {
        
        if(i==matrix.length-1 && j==matrix[0].length-1){
            return matrix[i][j];
        }
        
        if(i >= matrix.length || j >= matrix[0].length) {
            return Integer.MAX_VALUE;
        }
        if (dp[i][j]!=0) return dp[i][j];
        // int l=
        dp[i][j]=Math.min(path(i+1,j,dp), path(i,j+1,dp)) + matrix[i][j];
        
        return Math.min(path(i+1,j,dp), path(i,j+1,dp)) + matrix[i][j];
        
    }
}