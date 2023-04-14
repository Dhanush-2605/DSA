class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=sb.toString();
        int len=s.length();
        int[][] dp=new int[len][len];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        return LCS(len-1,len-1,s,rev,dp);
        
    }
    int LCS(int i,int j,String s1,String s2,int[][] dp){
        
        if (i<0 || j<0) return 0;
        if (dp[i][j]!=-1) return dp[i][j];
        int notTake=Math.max(LCS(i-1,j,s1,s2,dp),LCS(i,j-1,s1,s2,dp));
        int take=0;
        if (s1.charAt(i)==s2.charAt(j)){
            take=1+LCS(i-1,j-1,s1,s2,dp);
        }
        return dp[i][j]=Math.max(take,notTake);
    }
}