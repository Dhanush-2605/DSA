class Solution {
    public int firstMissingPositive(int[] nums) {
        cyclic(nums);
        int n=nums.length;
        // cycli(nums);
        for (int i=0;i<n;i++) if (nums[i]!=i+1) return i+1;
        return nums.length+1;
        
    }
    void cyclic(int[] nums){
        int i=0;
        while (i<nums.length){
            int crtInd=nums[i]-1;
            if (nums[i]<=0) i++;
            else if (nums[i]>nums.length) i++;
            else if (nums[i]==nums[crtInd]){
                i++;
                // continue;
            }
            else if (nums[i]!=i+1 && crtInd>=0){
                int temp=nums[i];
                nums[i]=nums[crtInd];
                nums[crtInd]=temp;
            }
            else i++;
            // else i++;

        }
}
}