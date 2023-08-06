class Solution {
    public int longestPalindromeSubseq(String s) {
         String res="";
        for (char ch:s.toCharArray()){
            res=ch+res;
        }
        int n=s.length();
        int[][] dp=new int[n][n];
        for (int[] arr:dp) Arrays.fill(arr,-1);

        return recurse(n-1,n-1,s,res,dp);
        
    }
    int recurse(int i,int j,String s,String p,int[][] dp){
        if (i<0 || j<0) return 0;
        if (dp[i][j]!=-1) return dp[i][j];
        int take=0;
        if (s.charAt(i)==p.charAt(j)){
            take=1+recurse(i-1,j-1,s,p,dp);
        }
        int notTake=Math.max(recurse(i-1,j,s,p,dp),recurse(i,j-1,s,p,dp));
        return dp[i][j]=Math.max(take,notTake);
    }
}