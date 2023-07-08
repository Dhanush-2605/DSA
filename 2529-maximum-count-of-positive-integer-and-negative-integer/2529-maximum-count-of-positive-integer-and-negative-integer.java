class Solution {
    public int maximumCount(int[] nums) {
        int l=0;
        int r=nums.length;
        int ctn=0;
                if (nums[0] == 0 && nums[r-1] == 0) return 0;

        while (r>l){
            int mid=l+(r-l)/2;
            // int val=nums[mid];
            if (nums[mid]==0){
                ctn++;
                l=mid+1;
            }
  
            else if (nums[mid]>0) r=mid;
            else l=mid+1;

         }
         return (int)Math.max(l-ctn,nums.length-l);
        
    }
}