class Solution {
    public int maxSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int R=r-2;
        int C=c-2;
        int res=-1;
        for (int i=0;i<R;i++){
            for (int j=0;j<C;j++){
                int sum=grid[i][j]+grid[i][j+1]+grid[i][j+2]+grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
                res=Math.max(res,sum);
            }
        }
        return res;
        
    }
}