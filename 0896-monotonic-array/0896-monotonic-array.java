class Solution {
    public boolean isMonotonic(int[] nums) {
      boolean increase=true;
      int n=nums.length;
      if (n==1) return true;
      int j=0;      
      while (j<n-1 && nums[j]==nums[j+1]){
          j++;
      }
        if (j+1<n && nums[j]>nums[j+1]) increase=false;

       for (int i=0;i<n-1;i++){
           if (increase){
               if (nums[i]>nums[i+1]) return false;
           }
           else{
               if (nums[i+1]>nums[i]) return false;
           }
           
       }
        return true;
        
    }
}