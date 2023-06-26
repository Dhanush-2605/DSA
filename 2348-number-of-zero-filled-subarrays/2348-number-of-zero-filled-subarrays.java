class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res=0;
        int n=nums.length;
        int[] dp=new int[n];
        if (nums[0]==0) dp[0]=1;
        // else dp[0]=-1;
        for (int i=1;i<n;i++){
            if (nums[i]==0 && nums[i-1]==0) dp[i]=1+dp[i-1];
            else if (nums[i]==0) dp[i]=1;
        }
        for (int val:dp) res+=val;
        return res;
        
    }
}