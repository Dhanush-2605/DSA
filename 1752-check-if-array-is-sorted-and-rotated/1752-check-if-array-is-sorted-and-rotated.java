class Solution {
    public boolean check(int[] nums) {
        int ctn=0;
        int n=nums.length;
        for (int i=0;i<n-1;i++){
            if (nums[i]>nums[i+1]){
                ctn++;
            }
        }

        if (ctn==1 && nums[n-1]>nums[0]) return false;

        if (ctn==1 || ctn==0) return true;
        return false;
        
    }
}