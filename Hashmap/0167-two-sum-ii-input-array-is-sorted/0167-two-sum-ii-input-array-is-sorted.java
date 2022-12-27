class Solution {
    public int[] twoSum(int[] nums, int target) {
      
    
        int n=nums.length;
        int[] res=new int[2];
        for (int i=0;i<n;i++){
            if (i>0 && nums[i]==nums[i-1]) continue;
            int l=0;
            int r=n-1;
            while (r>l){
                int sum=nums[l]+nums[r];
                if (sum>target) r--;
                else if (sum<target) l++;
                else{
                    res[0]=l+1;
                    res[1]=r+1;
                    break;

 

                }
            }
        
    }
                    return res;
    }
}