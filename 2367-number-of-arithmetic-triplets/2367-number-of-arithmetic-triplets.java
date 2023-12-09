class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n=nums.length;
        int res=0;
        for (int i=0;i<n;i++){
            int ctn=0;
            for (int j=i+1;j<n;j++){
                int d1=nums[j]-nums[i];                
                for (int k=j+1;k<n;k++){
                    int d2=nums[k]-nums[j];
                    if (d1==diff && d2==diff) res++;
                    
                }
                
            }
        }
        return res;
    }
}