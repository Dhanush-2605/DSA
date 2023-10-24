class Solution {

    public int uniquePaths(int M, int N) {
        int[][] dp=new int[M][N];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        return recurse(0,0,M,N,dp);
    }
    int recurse(int r,int c,int M,int N,int[][] dp){
        if (r==M-1 && c==N-1){   
            return 1;
        }
        if (r>=M || c>=N) return 0;
        if (dp[r][c]!=-1) return dp[r][c];

        int right=recurse(r+1,c,M,N,dp);
        int down=recurse(r,c+1,M,N,dp);
        int val=(right+down);
        return dp[r][c]=val;
        
    }     
    
   
    
}