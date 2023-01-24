class Solution {
    public int minCut(String s) {
        int len=s.length();
        int[] dp=new int[len];
        Arrays.fill(dp,-1);
        return recurse(0,len,s,dp)-1;
    }
    int recurse(int ind,int j,String s,int[] dp){
        if (ind>=j) return 0;
        if (dp[ind]!=-1) return dp[ind];
        int minCuts=Integer.MAX_VALUE;
        for (int k=ind;k<j;k++){
            if (isPalindrome(ind,k,s)==true){
                
            int cuts=1+recurse(k+1,j,s,dp);
            minCuts=Math.min(minCuts,cuts);
            }
        }
        return dp[ind]=minCuts;
    }
    boolean isPalindrome(int s,int e,String str){
        while (e>=s){
            if (str.charAt(s)!=str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
    
}