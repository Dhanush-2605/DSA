class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int len=nums.length;
      
        int gMax=nums[0];
        int cGMax=nums[0];
        int gMin=nums[0];
        int cGMin=nums[0];
        int tot=nums[0];
        for (int i=1;i<len;i++){
            tot+=nums[i];
            cGMax=Math.max(cGMax+nums[i],nums[i]);
            gMax=Math.max(gMax,cGMax);
            cGMin=Math.min(cGMin+nums[i],nums[i]);
            gMin=Math.min(gMin,cGMin);
        }
        int cirSum=tot-gMin;

        if (gMax<0) return gMax;
        return Math.max(gMax,cirSum);
     
    

        
    }

    
}






