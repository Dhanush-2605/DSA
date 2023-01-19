class Solution {
    static int prime =(int)(Math.pow(10,9)+7);

    public int numDistinct(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        int[][] dp=new int[n1+1][n2+1];
        for (int i=0;i<n1+1;i++) dp[i][0]=1;
        for (int i=1;i<n2+1;i++) dp[0][i]=0;
        
        for (int i=1;i<n1+1;i++){
            for (int j=1;j<n2+1;j++){
              if (s.charAt(i-1)==t.charAt(j-1)) dp[i][j]=(dp[i-1][j-1]+dp[i-1][j])%prime;
              else dp[i][j]=dp[i-1][j];             
            }
        }
        return dp[n1][n2];
        
    }

}