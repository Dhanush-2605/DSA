class Solution {
    public int maximalSquare(char[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int ans=0;
        int[][] res=new int[r][c];
        // for (int i=0;i<r;i++) res[i][0]=Character.getNumericValue(matrix[i][0]); 
        // for (int i=0;i<c;i++) res[0][i]=Character.getNumericValue(matrix[0][i]);
        // System.out.println(Arrays.deepToString(res));
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){

               if (i==0 || j==0) res[i][j]=Character.getNumericValue(matrix[i][j]);
               else{ 
                    if (matrix[i][j]=='1')
                    {
                    
                    res[i][j]=1+Math.min(res[i-1][j],Math.min(res[i][j-1],res[i-1][j-1]));
                    }
                   else res[i][j]=0;
                }
                                            ans=Math.max(ans,res[i][j]);

            }

        } 
        // System.out.println(Arrays.deepToString(res));

        return ans*ans;

    }
}