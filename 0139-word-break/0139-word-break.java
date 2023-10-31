class Solution {
    public boolean wordBreak(String S, List<String> wordDict) {
    HashMap<String,Integer> map=new HashMap<>();
        for (String s:wordDict){
            map.put(s,1);
        } 
        int[] dp=new int[S.length()+1];
        dp[dp.length-1]=1;
        for (int ind=dp.length-2;ind>=0;ind--){
           String temp="";
            for (int i=ind;i<S.length();i++){
                temp+=S.charAt(i);
                if (map.containsKey(temp)){
                        if (dp[i+1]==1) dp[ind]=1;;                        
            }
        }
              
        }
        return dp[0]==1?true:false;
     
    }
 
}