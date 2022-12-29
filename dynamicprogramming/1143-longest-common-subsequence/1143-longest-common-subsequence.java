class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        String s1=text1;
        String s2=text2;
        int n1=text1.length();
        int n2=text2.length();
        int[][] dp= new int[n1+1][n2+1];
        for (int i=0;i<=n1;i++) dp[i][0]=0;
        for (int j=0;j<=n2;j++) dp[0][j]=0;

        for (int ind1=1;ind1<=n1;ind1++){
            for (int ind2=1;ind2<=n2;ind2++){
               if (s1.charAt(ind1-1)==s2.charAt(ind2-1)) dp[ind1][ind2]=1+dp[ind1-1][ind2-1];
                
               else dp[ind1][ind2]=Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
              
            }
        }
        System.out.println(Arrays.deepToString(dp));
        // return recurse(text1.length()-1,text2.length()-1,text1,text2,dp);
        return dp[n1][n2];
        
    }

}