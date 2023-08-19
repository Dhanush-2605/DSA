class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n=stoneValue.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int ans=recurse(stoneValue,0,dp);

        // System.out.println(ans);
        if (ans>0) return "Alice";
        if (ans<0) return "Bob";
        return "Tie";
    }
    int recurse(int[] arr,int i,int[] dp){
        if (i>=arr.length){
            return 0;
        }
        if (dp[i]!=-1) return dp[i];
        // else{
        int ans=Integer.MIN_VALUE;
        ans=Math.max(ans,arr[i]-recurse(arr,i+1,dp));
        if (i+1<arr.length) ans=Math.max(ans,arr[i]+arr[i+1]-recurse(arr,i+2,dp));
        if (i+2<arr.length) ans=Math.max(ans,arr[i]+arr[i+1]+arr[i+2]-recurse(arr,i+3,dp));
        return dp[i]=ans;
        // }
    }
}