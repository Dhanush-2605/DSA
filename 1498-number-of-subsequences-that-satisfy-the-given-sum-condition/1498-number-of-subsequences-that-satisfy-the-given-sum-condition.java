class Solution {
    public int numSubseq(int[] nums, int target) {

        Arrays.sort(nums);
        int mod=1000000007;
        int ans=0;
        int[] res=new int[nums.length];
        res[0]=1;
        for (int i=1;i<nums.length;i++){
            res[i]=(2*res[i-1])%mod;

        }
        int left=0;
        int right=nums.length-1;

        

        while ( left<=right){
            if (nums[left]+nums[right]>target) right--;
            else{
                ans=(ans+res[right-left])%mod;
                left++;
            }
             
            }
            return ans;
     
         
        
        
  
  


    }

}