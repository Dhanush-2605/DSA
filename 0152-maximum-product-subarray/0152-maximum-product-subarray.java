class Solution {
    public int maxProduct(int[] nums) {
        int minNum=nums[0];
        int maxNum=nums[0];
        int n=nums.length;
        int res=nums[0];
        for (int i=1;i<n;i++){
            if (nums[i]<0){
                int temp=minNum;
                minNum=maxNum;
                maxNum=temp;
            
            }
            minNum=Math.min(nums[i],minNum*nums[i]);
            maxNum=Math.max(nums[i],maxNum*nums[i]);
            
            res=Math.max(res,maxNum);
        }
        return res;
        
    }
}