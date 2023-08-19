class Solution {
    public String stoneGameIII(int[] arr) {
        int n=arr.length;
        int[] dp=new int[n+1];
        
        for (int i=n-1;i>=0;i--){
        int ans=Integer.MIN_VALUE;
        ans=Math.max(ans,arr[i]-dp[i+1]);
        if (i+1<arr.length) ans=Math.max(ans,arr[i]+arr[i+1]-dp[i+2]);
        if (i+2<arr.length) ans=Math.max(ans,arr[i]+arr[i+1]+arr[i+2]-dp[i+3]);
        dp[i]=ans;          
        }
        int an=dp[0];
        if (an>0) return "Alice";
        if (an<0) return "Bob";
        return "Tie";
    }
  
}