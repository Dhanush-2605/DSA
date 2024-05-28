class Solution {
    public int numDecodings(String s) {
                int[] dp=new int[s.length()+1];
                Arrays.fill(dp,-1);

        return recurse(s,0,dp);
        
    }
    int recurse(String s,int ind,int[] dp){
        if (ind>=s.length()) return 1;
        if (s.charAt(ind)=='0') return 0;
        if (dp[ind]!=-1) return dp[ind];
        
        int ways=recurse(s,ind+1,dp);
        if (ind+1<s.length() && Integer.parseInt(s.substring(ind,ind+2))<=26){
            ways+=recurse(s,ind+2,dp);
            
            
        }
        return dp[ind]=ways;
    }
}