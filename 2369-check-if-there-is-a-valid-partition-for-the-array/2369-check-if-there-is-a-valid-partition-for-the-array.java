class Solution {
    public boolean validPartition(int[] nums) {
        Boolean[] dp=new Boolean[nums.length];
        return recurse(nums,dp,0,nums.length);
        
    }
    boolean recurse(int[] nums,Boolean[] dp,int i,int n){
        if (i>=nums.length) return true;
        if (dp[i]!=null) return dp[i];
        boolean res=false;
        if (i+1<n && nums[i]==nums[i+1]){
            res=res||recurse(nums,dp,i+2,n);
        }
        if (i+2<n && nums[i]==nums[i+1] && nums[i]==nums[i+2]){
            res=res||recurse(nums,dp,i+3,n);
        }
        if (i+2<n && nums[i+1]-nums[i]==1 && nums[i+2]-nums[i+1]==1){
            res=res||recurse(nums,dp,i+3,n);
        }
        return dp[i]=res;
        
        
    }
}