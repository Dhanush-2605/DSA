class Solution {
    public boolean isMatch(String s, String p) {
        int i = s.length();
        int j = p.length();
        
        boolean[][] dp = new boolean[i+1][j+1];
        
        dp[0][0] = true;
        
        for (int k = 1; k < j + 1; k++) {
            if (p.charAt(k - 1) == '*') {
                dp[0][k] = dp[0][k-1];
            }
        }
        
        
        for(int x = 1 ; x <= i ; x++)
        {
            for(int y = 1 ; y <= j ; y++){
                if(s.charAt(x-1) == p.charAt(y-1) || p.charAt(y-1) == '?')   
                    dp[x][y] = dp[x-1][y-1];
                else if(p.charAt(y-1) == '*')   
                    dp[x][y] = (dp[x-1][y] | dp[x][y-1]);
            }
        }
        
        return dp[i][j];
    }
}