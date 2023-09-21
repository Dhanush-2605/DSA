class Solution {
    public int minOperations(int[] nums, int x) {
        int l=0;
        int r=0;
        int cSum=0;
        int n=nums.length;
        int sum=0;
        for (int val:nums) sum+=val;
        int target=sum-x;
        int res=-1;
        while (r<n){
            cSum+=nums[r];
            while (r>=l && cSum>target){
                cSum=cSum-nums[l];
                l++;
            }
            if (cSum==target) res=Math.max(res,r-l+1);

            r++;
        }
        if (res==-1) return -1;
        return n-res;
        
    }
}