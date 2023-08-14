class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n=nums.length;
       int[] res=new int[n];
       int i=1;
       int j=0;
       Arrays.sort(nums);
       int ind=0;
       while (i<n){
           res[i]=nums[ind];
           i+=2;
           ind++;
       }
       while (j<n){
           res[j]=nums[ind];
           j+=2;
           ind++;
       }
       return res;


    }
}