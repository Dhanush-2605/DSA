class Solution {
    public int jump(int[] arr) {
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int ans=recurse(arr,0,dp);
        if (ans==100000000) return -1;
        return ans;
    }
    static int recurse(int[] arr,int ind,int[] dp){
        if (ind>=arr.length-1) return 0;
        if (dp[ind]!=-1) return dp[ind];
        int ans=100000000;
        for (int i=1;i<=arr[ind];i++){
            int val=1+recurse(arr,ind+i,dp);
            ans=Math.min(ans,val);
        }
        return dp[ind]=ans;
    }
}