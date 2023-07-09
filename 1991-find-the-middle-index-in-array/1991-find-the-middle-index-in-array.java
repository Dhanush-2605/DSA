class Solution {
    public int findMiddleIndex(int[] nums) {
        int lSum=0;
        int rSum=0;
        int l=nums.length;
        for (int i=0;i<l;i++){
            rSum+=nums[i];
        }
        int prev=0;
        rSum-=nums[0];
        int i=1;
        if (rSum==0) return 0;
        while (i<l){
            lSum+=nums[prev];
            rSum-=nums[i];
            if (lSum==rSum) return i;
            prev=i;
            i++;
        }
        return -1;        
    }
}