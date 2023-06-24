class Solution {
    public int minCut(String s) {
        int len=s.length();
        int[] dp=new int[len+1];
        for (int ind=len-1;ind>=0;ind--){
        int minCuts=Integer.MAX_VALUE;
        for (int k=ind;k<len;k++){
            if (isPalindrome(ind,k,s)==true){
                
            int cuts=1+dp[k+1];
            minCuts=Math.min(minCuts,cuts);
            }
        }
        dp[ind]=minCuts;
            
        }
        return dp[0]-1;
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