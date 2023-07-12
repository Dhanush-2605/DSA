class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while (r>=l){
            int mid=l+(r-l)/2;
            
            if (mid-1>=0 && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
                                                                                                                             
            if (nums[mid]>nums[r]){
                l=mid+1;
            }
            
            else r=mid-1;        
            
        
        }
        
    
        return nums[0];
        
    }
}