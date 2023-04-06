class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ctn=0;
        int l=nums.length;
        for (int i=0;i<l;i++){
            if (nums[i]<k) ctn++;
        }
        for (int i=0;i<l;i++){
            int curP=nums[i];
            for (int j=i+1;j<l;j++){
                curP=curP*nums[j];
                if (curP<k) ctn++;
                else break;
            }
            
        }
        return ctn;
        
        
    }
}