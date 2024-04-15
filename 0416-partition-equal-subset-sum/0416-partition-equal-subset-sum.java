class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for (int val:nums) sum+=val;
     
        if (sum%2!=0) return false;
        sum=sum/2;
        int[][] dp=new int[nums.length][sum+1];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        return recurse(nums,0,sum,dp);
    }
    boolean recurse(int[] nums,int ind,int target,int[][] dp){
        if (target==0) return true;
        if (target<0 || ind>=nums.length) return false;
        if (dp[ind][target]!=-1){
            if (dp[ind][target]==0) return false;
            return true;
        }
        boolean take=false;
        if (target>=nums[ind]){
            take=recurse(nums,ind+1,target-nums[ind],dp);
        }
        boolean notTake=recurse(nums,ind+1,target,dp);
        
        boolean temp=take|| notTake;
        if (temp) dp[ind][target]=1;
        else dp[ind][target]=0;
        return temp;
    }
}