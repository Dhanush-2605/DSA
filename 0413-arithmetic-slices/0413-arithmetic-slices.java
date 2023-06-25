class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int res = 0;
        if(nums.length <= 2)return res;
        for(int i = 2;i<nums.length;i++){
            int temp = 0;
            for(int j = i;j>1;j--){
                if(nums[j] - nums[j-1] == nums[j-1] - nums[j-2]){
                    temp++;
                }else{
                    break;
                }
            }
            res += temp;
        }
        return res;
    }
}