class Solution {
    public int minIncrementForUnique(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int res=0;
        for (int i=1;i<len;i++){
            if (nums[i]<=nums[i-1]){
                int newVal=nums[i-1]+1;
                res+=newVal-nums[i];
                nums[i]=newVal;
            }
        }
        return res;
    }
}