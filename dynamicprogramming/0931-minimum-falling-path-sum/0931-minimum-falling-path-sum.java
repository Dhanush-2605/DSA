class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int r=matrix.length;
        int res=100000;
        int[][] dp=new int[r][r];
        for (int i=0;i<r;i++){
            int l=recurse(r-1,i,matrix,r,dp);
            res=Math.min(res,l);

            
        }
        System.out.println(res);
        return res;
    
        
    }
    int recurse(int r,int c,int[][] matrix,int n,int[][] dp){
        if (c<0||c>n-1) return 100000000;

        if (r==0) return matrix[r][c];
        if (dp[r][c]!=0) return dp[r][c];
      
      
        int r1=matrix[r][c]+recurse(r-1,c,matrix,n,dp);
        
        int r2=matrix[r][c]+recurse(r-1,c-1,matrix,n,dp);
        int r3=matrix[r][c]+recurse(r-1,c+1,matrix,n,dp);
        int min=Math.min(r1,r2);
        int res=Math.min(min,r3);
        dp[r][c]=res;
        return res;
    }
}