class Solution {
    public int largestPerimeter(int[] nums) {
       Arrays.sort(nums);
       int len=nums.length;
        int c=0;
        
        
        for (int i=len-1;i>=2;i--){
            int tar=nums[i];
            int l=i-2;
            int r=i-1;
           if (nums[r]+nums[l]>tar){
               return nums[r]+nums[l]+tar;
           }           
       

    }
        
    return 0;
               
    }
}