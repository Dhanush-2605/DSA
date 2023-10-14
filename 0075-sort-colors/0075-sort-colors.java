class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h=nums.length-1;
        int n=nums.length;
        while (h>=m){
            if (nums[m]==0){
            int temp=nums[l];
            nums[l]=nums[m];
            nums[m]=temp;

                l++;
                m++;
                
            }
            else if (nums[m]==1){
                m++;
            }
            else{
                  int temp=nums[h];
                  nums[h]=nums[m];
                  nums[m]=temp;
                h--;
            }
        }
        
    }

}