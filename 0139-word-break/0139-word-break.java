class Solution {
    public boolean wordBreak(String S, List<String> wordDict) {
    HashMap<String,Integer> map=new HashMap<>();
        for (String s:wordDict){
            map.put(s,1);
        } 
        int[] dp=new int[S.length()];
        Arrays.fill(dp,-1);
        return recurse(0,map,S,dp)==1?true:false;
     
    }
    int recurse(int ind,HashMap<String,Integer> map,String S,int[] dp){
        if (ind==S.length()) return 1;
        if (dp[ind]!=-1) return dp[ind];
        String temp="";
        for (int i=ind;i<S.length();i++){
            temp+=S.charAt(i);
            if (map.containsKey(temp)){
                if (recurse(i+1,map,S,dp)==1) return dp[ind]=1;
            }
        }
        return dp[ind]=0;
        
    }
}