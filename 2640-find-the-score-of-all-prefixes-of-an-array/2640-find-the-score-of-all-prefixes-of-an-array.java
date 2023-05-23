class Solution {
    public long[] findPrefixScore(int[] nums) {
        int prevMax=nums[0];
        int n=nums.length;
        long[] res=new long[n];
        for (int i=0;i<n;i++){
           prevMax=Math.max(prevMax,nums[i]);
            res[i]=nums[i]+prevMax;
            
        }
        for (int i=1;i<n;i++){
            res[i]=res[i]+res[i-1];
            
        }
        return res;
        
    }
}