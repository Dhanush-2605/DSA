class Solution {
    public int maximumScore(int[] nums, int k) {
        int l=k;
        int r=k;
        int res=nums[k];
        int curMin=nums[k];
        while (l>0 || r<nums.length){
            int left=l>0?nums[l-1]:0;
            int right=r<nums.length-1?nums[r+1]:0;
            if (left>right){
                l-=1;
                curMin=Math.min(curMin,left);
                
            }
            else{
                r+=1;
                curMin=Math.min(curMin,right);
            }
            res=Math.max(res,curMin*(r-l+1));
        }
        return res;
        
    }
}