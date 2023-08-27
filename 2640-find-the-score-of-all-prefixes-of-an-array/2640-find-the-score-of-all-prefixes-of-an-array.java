class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long[] cur=new long[n];
        int max=nums[0];
        cur[0]=max+max;
        for (int i=1;i<n;i++){
            long s=nums[i]+Math.max(nums[i],max);
            cur[i]=s;            
            if (nums[i]>max) max=nums[i];
        }
        for (int i=1;i<n;i++){
            cur[i]=cur[i]+cur[i-1];
            
        }
        return cur;
        
        
    }
}