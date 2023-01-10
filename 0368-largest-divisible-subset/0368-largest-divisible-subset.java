class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int[] dp=new int[n];
        int[] hash=new int[n];
         Arrays.fill(dp,1);
        int large_ind=0;
        for (int i=0;i<n;i++){
            hash[i]=i;
            for (int j=0;j<i;j++){
                if (nums[i]%nums[j]==0 && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                    hash[i]=j;
                }
            }
        }
        int max=0;
        int max_ind=0;
        for (int i=0;i<n;i++){
            if (dp[i]>max) {
                max=dp[i];
                max_ind=i;
            };
        }
        int lastInd=max_ind;
        res.add(nums[max_ind]);
        while (hash[lastInd]!=lastInd){
            lastInd=hash[lastInd];
            res.add(nums[lastInd]);
        }        
        return res;
    }
}