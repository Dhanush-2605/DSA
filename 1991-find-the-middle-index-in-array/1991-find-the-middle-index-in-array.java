class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=nums[0];
        suffix[n-1]=nums[n-1];
        for (int i=1;i<n ;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        for (int j=n-2;j>=0;j--){
            suffix[j]=nums[j]+suffix[j+1];
        }
     
        for (int i=0;i<n;i++){
            if (prefix[i]==suffix[i]) return i;
        }

        return -1;
        
    }
}