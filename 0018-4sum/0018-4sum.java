class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Set<List<Integer>> set=new HashSet<>();
    List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);

        for (int i=0;i<n;i++){
            if (i>0 && nums[i]==nums[i-1]) continue;
            for (int j=i+1;j<n;j++){
                if (j!=i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=n-1;
                while (l>k){
                List<Integer> cur=new ArrayList<>();

                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if (sum==target){
                      cur.add(nums[i]);
                     cur.add(nums[j]);  
                     cur.add(nums[k]);
                     cur.add(nums[l]);              
                        k++;
                        l--;
                        while (k<l && nums[l]==nums[l+1]) l--;
                        while (k<l && nums[k]==nums[k-1]) k++;
                                        res.add(cur);

                        
                    }
                    else if (target>sum) k++;
                    else l--;
                }               
                
            }
            
        }
     
        if (res.size()==0){
            
        }
        return res;
        
    }

}