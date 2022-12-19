class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for (int i=0;i<nums.length;i++) sum+=nums[i];
        if (sum%2!=0)return false;
        int n=sum/2;
        int[][] dp=new int[200+1][n+1];
        return recurse(nums.length-1,n,nums,dp);        
      
        
        
    }
    boolean recurse(int ind,int target,int[] nums,int[][] dp){
        if (target==0) return true;
        if (ind==0) return (nums[ind]==target);
            
        
        if (dp[ind][target]!=0){
            if (dp[ind][target]==1) return false;
            else return true;

        }
        boolean unTake=recurse(ind-1,target,nums,dp);
        boolean take=false;
        if (target>=nums[ind]) take=recurse(ind-1,target-nums[ind],nums,dp);
        boolean res=unTake || take;
        if (res) dp[ind][target]=2;
        else dp[ind][target]=1;
        return (res);
    }
    
}