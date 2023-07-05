class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int res=0;
        for (int j=0;j<n;j++){
            if (nums[j]==0) k--;
            while (k<0){
                if (nums[i]==0) k++;
                i++;
            }
            res=Math.max(res,j-i+1);
        }
        return res;
        
    }
}