// TC-O(N);
// SC-O(1);
class MaxProductSubArray{
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int cur_max=nums[0];
        int cur_min=nums[0];
        int res=cur_max; 
        
        for (int i=1;i<nums.length;i++){
            if (nums[i]<0){
                int temp=cur_max;
                cur_max=cur_min;
                cur_min=temp;
            }
            cur_max=Math.max(nums[i],nums[i]*cur_max);
            cur_min=Math.min(nums[i],nums[i]*cur_min);
            
            res=Math.max(res,cur_max);
            
          
            
        }
      
    }
}