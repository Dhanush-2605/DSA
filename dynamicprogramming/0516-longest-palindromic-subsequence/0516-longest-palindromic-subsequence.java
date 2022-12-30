class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String rev=sb.toString();
        int n=s.length();
        int[][] dp=new int[n+1][n+1];
        for (int[] row:dp) Arrays.fill(row,-1);
        return recurse(n-1,n-1,s,rev,dp);
        
    }
    static int recurse(int ind1,int ind2,String s1,String s2,int[][] dp){
        if (ind1<0 || ind2<0) return 0;
        if (dp[ind1][ind2]!=-1) return dp[ind1][ind2];
        if (s1.charAt(ind1)==s2.charAt(ind2)) return dp[ind1][ind2]=1+recurse(ind1-1,ind2-1,s1,s2,dp);
        else return dp[ind1][ind2]=Math.max(recurse(ind1-1,ind2,s1,s2,dp),recurse(ind1,ind2-1,s1,s2,dp));
    }
}