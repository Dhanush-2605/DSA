class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
       int len=nums.length;
        int c=0;             
        for (int i=len-1;i>=2;i--){
            int tar=nums[i];
            int l=0;
            int r=i-1;
            while (r>l){
                if (nums[r]+nums[l]>tar){
                    c+=r-- -l;
                    // r--;
                }
                else l++;
            }        

    }
        
    return c;
        
    }
}