class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int pI=0;
        int nI=1;
        for (int i=0;i<n;i++){
            if (nums[i]>0){
                res[pI]=nums[i];
                pI+=2;                
            }
            
        }
       for (int i=0;i<n;i++){
            if (nums[i]<0){
                res[nI]=nums[i];
                nI+=2;                
            }
            
        }   
        return res;
        
    }
}