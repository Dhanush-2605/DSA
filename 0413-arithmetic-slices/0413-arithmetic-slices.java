class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int res = 0;
        if(nums.length <= 2)return res;
        int[] dp=new int[nums.length];
        for(int i = 2;i<nums.length;i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                  dp[i]=dp[i-1]+1;
                }
            
            res += dp[i];
        }
        return res;
    }
}