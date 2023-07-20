class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> temp1=new ArrayList<>();
        recurse(0,candidates,res,temp1,target,0);
        return res;
        
    }
    void recurse(int ind,int[] nums,List<List<Integer>> res,List<Integer> cur,int target,int sum){
        if (sum>target) return;
  
        if (ind>=nums.length){
            if (sum== target){
            List<Integer> temp=new ArrayList<>(cur);
            res.add(temp);
          
        }   
              return;
        }
        
      
        cur.add(nums[ind]);
        sum+=nums[ind];
        recurse(ind+1,nums,res,cur,target,sum);
        cur.remove(cur.size()-1);
        sum-=nums[ind];
        while (ind+1<nums.length && nums[ind]==nums[ind+1]) ind++;
        recurse(ind+1,nums,res,cur,target,sum);
    }
}