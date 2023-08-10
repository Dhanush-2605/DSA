class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if (n<=4) return 0;
        
        int l=0;
        int r=n-4;
        int res=Integer.MAX_VALUE;
        while (r<n){
            res=Math.min(res,nums[r++]-nums[l++]);


        }
      return res;  
    }
}