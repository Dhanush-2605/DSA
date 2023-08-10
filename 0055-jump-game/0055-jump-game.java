class Solution {
    public boolean canJump(int[] nums) {
        int rechable=0;
        int n=nums.length;
        for (int i=0;i<n;i++){
                if (rechable<i) return false;
            int reach=i+nums[i];
            if (reach>rechable) rechable=reach;
        }
        return true;
        
    }
}