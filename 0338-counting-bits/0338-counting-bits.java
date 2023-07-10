class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        int[] dp=new int[n+1];
        int offset=1;
        for (int i=1;i<=n;i++){
            int cur=i;
            if (offset*2==cur) offset=cur;
            dp[i]=1+dp[cur-offset];
    
          
        }
        return dp;
        
    }
}