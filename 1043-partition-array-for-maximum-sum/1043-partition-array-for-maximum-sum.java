class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return recurse(0,n,arr,k,dp);
        
    }
    int recurse(int ind,int n,int[] arr,int k,int[] dp){
        if (ind>=n) return 0;
        if (dp[ind]!=-1) return dp[ind];
        int max=Integer.MIN_VALUE;
        int len=0;
        int maxRes=Integer.MIN_VALUE;
        for (int i=ind;i<Math.min(ind+k,n);i++){
            len++;
            max=Math.max(max,arr[i]);
            int sum=(len)*max+recurse(i+1,n,arr,k,dp);
            maxRes=Math.max(maxRes,sum);
            
            
        }
        return dp[ind]=maxRes;
    }
}