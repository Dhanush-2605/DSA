class Solution {
    public int minInsertions(String s) {
        int n1=s.length();
        StringBuilder sr=new StringBuilder(s);
        sr.reverse();
        String rev=sr.toString();
        int n2=n1;
        int[][] dp=new int[n1+1][n2+1];
        for (int i=0;i<=n1;i++) dp[i][0]=0;
        for (int i=0;i<=n2;i++) dp[0][i]=0;

        for (int i=1;i<=n1;i++){            
            for (int j=1;j<=n2;j++){
                if (s.charAt(i-1)==rev.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                
            }
        }
        int subLen=dp[n1][n2];
        return n1-subLen;
        
    }
}