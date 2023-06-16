class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] dp=new int[r][c];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                DFS(i,j,-1,r,c,matrix,dp);
            }
        }
        int ans=0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                ans=Math.max(ans,dp[i][j]);
            }
        }
        return ans;
               
    }
    
    int DFS(int r,int c,int prev,int m,int n,int[][] matrix,int[][] dp){
        if (r<0 || c<0 || r>=m || c>=n || matrix[r][c]<=prev) return 0;
        
    if (dp[r][c]!=-1) return dp[r][c];
        int res=1;
        int[] delR={-1,0,1,0};
        int[] delC={0,1,0,-1};
        
        
        for (int i=0;i<4;i++){
            int newR=r+delR[i];
            int newC=c+delC[i];
            res=Math.max(res,1+DFS(newR,newC,matrix[r][c],m,n,matrix,dp));
        }
        dp[r][c]=res;
      return res;
    }
}