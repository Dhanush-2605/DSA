class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ress=new ArrayList<>();
             Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (i>0 && nums[i]==nums[i-1]) continue;
             
            int l=i+1;
            int r=nums.length-1;
        while (r>l){
            int sum=nums[i]+nums[l]+nums[r];
            if (sum>0){
                r-=1;
            }
            else if (sum<0){
                l+=1;
            }
            else{
                List<Integer> res=new ArrayList<>();
                res.add(nums[l]);
                res.add(nums[r]);
                res.add(nums[i]);
                ress.add(res);
               l++;
                while (l<r && nums[l]==nums[l-1]){
                    l++;
                    }
                
                
            }
            
        }
            
        }
        return ress;
        
    }

    
}