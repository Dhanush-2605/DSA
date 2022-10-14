package miscellaneous;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
        
    }
    static int maxSubArray(int[] nums) {
        int global=nums[0];
        int cur=nums[0];
        if (nums.length==1){
            return nums[0];
        }
        for (int i=1;i<nums.length;i++){
            cur=Math.max(nums[i],cur+nums[i]);
            if (cur>global){
                global=cur;
            }
        }
        return global;
    }
    
}
