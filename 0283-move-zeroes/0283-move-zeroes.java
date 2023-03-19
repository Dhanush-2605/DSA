class Solution {
    public void moveZeroes(int[] nums) {
      
        int s=0;
        int f=1;
        while (f<nums.length){
            if (nums[s]==0 && nums[f]==0){
                f++;
            }
            else if (nums[s]==0 && nums[f]!=0){
                int temp=nums[s];
                nums[s]=nums[f];
                nums[f]=temp;
                s++;
                f++;
                
            }
            else{
                s++;
                f++;
            }
        }
    }
    
}