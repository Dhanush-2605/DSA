class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length();
        int l2=text2.length();
        int[][] dp=new int[l1][l2];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        return recurse(l1-1,l2-1,text1,text2,dp);
    }
    int recurse(int i1,int i2,String s1,String s2,int[][] dp){
        if (i1<0 || i2<0) return 0;
        if (dp[i1][i2]!=-1) return dp[i1][i2];
        if (s1.charAt(i1)==s2.charAt(i2)){
            return dp[i1][i2]=1+recurse(i1-1,i2-1,s1,s2,dp);
        }        
            return dp[i1][i2]=Math.max(recurse(i1-1,i2,s1,s2,dp),recurse(i1,i2-1,s1,s2,dp));
        
    }
}