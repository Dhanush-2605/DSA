class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int ls=0;
        int rs=0;
        int n=nums.length;
        int[] res=new int[n];
        for (int val:nums) rs+=val;
        for (int i=0;i<n;i++){
            if (i-1>=0) ls+=nums[i-1];
            
            rs=rs-nums[i];
            int lCtn=(i+1)*nums[i];
            int rCtn=(n-i)*nums[i];
            int temp=lCtn-ls;
            int temp1=rs-rCtn;
            res[i]=temp+temp1;
            
        }
        return res;
    }
}