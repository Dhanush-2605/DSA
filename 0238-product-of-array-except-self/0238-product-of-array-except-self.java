class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prf=new int[n];
        int[] suf=new int[n];
        prf[0]=nums[0];
        suf[n-1]=nums[n-1];
        for (int i=1;i<n;i++){
            prf[i]=prf[i-1]*nums[i];
        }
        for (int i=n-2;i>=0;i--){
            suf[i]=suf[i+1]*nums[i];
        }
        int[] res=new int[n];
        res[0]=suf[1];
        res[n-1]=prf[n-2];
 

        for (int i=1;i<n-1;i++){
            res[i]=prf[i-1]*suf[i+1];
        }
        return res;
        
    }
}