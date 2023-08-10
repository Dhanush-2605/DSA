class Solution {
    public boolean search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        while (r>=l){
            int mid=l+(r-l)/2;
            if (nums[mid]==target) return true;
      if(nums[l] == nums[mid] && nums[mid] == nums[r]) {
                l ++;
                r--;
            }
            else if (nums[mid]>=nums[l]){
               if (nums[l]>target || target>nums[mid]) l=mid+1;
                else r=mid-1;
            }
            else{
              if (target>nums[r] || target<nums[mid]) r=mid-1;
            else l=mid+1;
                  
              
            
        }
    }
            return false;
        
    }
}