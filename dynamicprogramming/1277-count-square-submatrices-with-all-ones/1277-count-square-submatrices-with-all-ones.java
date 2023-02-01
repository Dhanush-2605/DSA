//ITERATIVE SOLUTION IS MORE INTUITIVE THAN RECURSIVE SOLUTION

class Solution {
    public int countSquares(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[][] dp=new int[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (i==0) dp[0][j]=matrix[0][j];
                else dp[i][0]=matrix[i][0];
                
            }
        }
        for (int i=1;i<row;i++){
            for (int j=1;j<col;j++){
                int min=Math.min(dp[i-1][j],dp[i][j-1]);
                int cur=Math.min(dp[i-1][j-1],min);
                if (matrix[i][j]!=0) dp[i][j]=1+cur;
                else dp[i][j]=0;
                
            }
        }
        int ans=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                ans+=dp[i][j];
            }
        }
        return ans;
        
    }
}