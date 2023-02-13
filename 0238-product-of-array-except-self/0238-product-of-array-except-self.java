class Solution {
    public int[] productExceptSelf(int[] nums) {
            int l=nums.length;

        int[] prefix=new int[l];
        int[] postfix=new int[l];
        prefix[0]=1;
        postfix[l-1]=1;
        for (int i=1;i<l;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        for (int i=l-2;i>=0;i--){
            postfix[i]=postfix[i+1]*nums[i+1];
        }
        for (int i=0;i<l;i++){
            nums[i]=prefix[i]*postfix[i];
        }
        return nums;
        
    }
}