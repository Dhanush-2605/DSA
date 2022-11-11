package algorithms;

public class KadanesAlgo{
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,76};
        int res=maxSubArray(nums);
        System.out.println(res);
    
    }
    static public int maxSubArray(int[] nums) {
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
