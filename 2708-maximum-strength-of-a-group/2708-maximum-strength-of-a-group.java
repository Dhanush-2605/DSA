class Solution {
    public long maxStrength(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return nums[0];
        Arrays.sort(nums);
        long mul = 1;
        int neg = 0, pos = 0, zero = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                mul *= nums[i];
                pos++;
            }else if(nums[i] == 0){
                zero++;
                continue;
            }else{
                neg++;
            }
        }
        if(pos == 0 && neg == 0)
            return 0;
        if(pos == 0 && neg == 1 && zero >= 1)
            return 0;
        if(neg % 2 == 0){
            for(int i = 0; i < neg; i++){
                mul *= nums[i];
            }
        }else{
            for(int i = 0; i < neg-1; i++){
                mul *= nums[i];
            }
        }
        return mul;
    }
}