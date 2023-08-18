class Solution {
    public List<Integer> goodIndices(int[] nums, int k) {
        int n=nums.length;
        int[] nonInc=new int[n];
        int[] nonDec=new int[n];
        nonInc[0]=1;
        nonDec[n-1]=1;
        for (int i=1;i<n;i++){
            if (nums[i-1]>=nums[i]) nonInc[i]=1+nonInc[i-1];
            else nonInc[i]=1;
        }
        for (int i=n-2;i>=0;i--){
            if (nums[i+1]>=nums[i]) nonDec[i]=1+nonDec[i+1];
            else nonDec[i]=1;
        }
        List<Integer> res=new ArrayList<>();
        for (int i=k;i<=n-k-1;i++){
            if (nonInc[i-1]>=k && nonDec[i+1]>=k) res.add(i);
        }
       

        return res;

   

        
    }
}