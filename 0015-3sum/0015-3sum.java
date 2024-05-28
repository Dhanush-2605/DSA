class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for (int i=0;i<n;i++){
            if (i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while (k>j){
                int sum=nums[i]+nums[j]+nums[k];
                if (sum<0) j++;
                else if (sum>0) k--;
                else{
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    j++;
                    k--;
                    while (k>j && nums[j]==nums[j-1]) j++;
                    while (k>j && nums[k]==nums[k+1]) k--;
                    res.add(temp);
                }
            }
        }
        return res;
        
    }
}