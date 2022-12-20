class Solution {
    public int findTargetSumWays(int[] nums, int targ) {
        int sum=0;
        for (int i=0;i<nums.length;i++) sum+=nums[i];
        
        int tar=(sum-targ)/2;
        if (sum-targ<0 || (sum-targ)%2!=0) return 0;
        
        int[][] dp=new int[nums.length][tar+1];
        if (nums[0]==0) dp[0][0]=2;
        else dp[0][0]=1;
        
        if (nums[0]!=0 && nums[0]<=tar) dp[0][nums[0]]=1;
        // for (int i=0;i<nums.length;i++) dp[i][0]=1;
        
        for (int ind=1;ind<nums.length;ind++){
            for (int target=0;target<=tar;target++){
                int unTake=dp[ind-1][target];
                int take=0;
                if (target>=nums[ind]) take=dp[ind-1][target-nums[ind]];
                dp[ind][target]=unTake+take;     
            }
        }
        return dp[nums.length-1][tar];

    }

}