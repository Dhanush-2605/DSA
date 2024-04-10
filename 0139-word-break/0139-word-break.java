class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp=new int[s.length()];
        Arrays.fill(dp,-1);

        return recurse(s,wordDict,0,dp);
    }
    static boolean recurse(String s,List<String> dict,int ind,int[] dp){
        if (ind>=s.length()) return true;
        if (dp[ind]!=-1){
            if (dp[ind]==0) return false;
            return true;
        }
        boolean ans=false;

        for (String cur:dict){

            if (s.startsWith(cur,ind)){
                ans=ans|| recurse(s,dict,ind+cur.length(),dp);
            }




        }
        if (ans==false) dp[ind]=0;
        else dp[ind]=1;

        return ans;

    }
}