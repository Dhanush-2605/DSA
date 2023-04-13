class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;       
        int val=0;
        for (int i=0;i<n;i++){
          if (n%2!=0){
              if (i==n-i-1) val=mat[i][i];
          }
          sum+=mat[i][i]+mat[i][n-i-1];
        
        }
        return sum-val;
    }
}