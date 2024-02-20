class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int tot=0;
        for (int i=0;i<=n;i++){
            tot+=i;
        }
        int cur=0;
        for (int val:nums) cur+=val;
        
        return tot-cur;
        
    }
}