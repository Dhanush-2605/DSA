class Solution {
    public int maximalSquare(char[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] dp=new int[r][c];
        int res=0;

        for (int i=0;i<r;i++){
            dp[i][0]=Character.getNumericValue(matrix[i][0]);
            res=Math.max(res,dp[i][0]);
        }
        for (int i=0;i<c;i++){
            dp[0][i]=Character.getNumericValue(matrix[0][i]);
            res=Math.max(res,dp[0][i]);

        }
        for (int i=1;i<r;i++){
            for (int j=1;j<c;j++){
                if (matrix[i][j]=='0') dp[i][j]=0;
                else{
                    int n1=dp[i-1][j];
                    int n2=dp[i][j-1];
                    int n3=dp[i-1][j-1];
                    dp[i][j]=1+Math.min(n1,Math.min(n2,n3));

                    res=Math.max(res,dp[i][j]);
                }
            }
        }
        return res*res;
    }
}