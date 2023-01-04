class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int[][] dp=new int[n1][n2];
        for (int[] row:dp) Arrays.fill(row,-1);
        return recurse(n1-1,n2-1,word1,word2,dp);
        
    }
    int recurse(int i,int j,String s1,String s2,int[][] dp){
        if (i<0) return j+1;
        if (j<0) return i+1;
        if (dp[i][j]!=-1) return dp[i][j];
        if (s1.charAt(i)==s2.charAt(j)) return dp[i][j]=recurse(i-1,j-1,s1,s2,dp);
        else{
            int d=1+recurse(i,j-1,s1,s2,dp);
            int r=1+recurse(i-1,j-1,s1,s2,dp);
            int in=1+recurse(i-1,j,s1,s2,dp);
            int res1=Math.min(d,r);
            return dp[i][j]=Math.min(res1,in);
            
        }
    }
}