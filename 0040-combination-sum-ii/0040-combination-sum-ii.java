class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> res=new ArrayList<>();
             Arrays.sort(candidates);
            List<Integer> temp1=new ArrayList<>();
            recurse(0,candidates,res,temp1,target);
        return res;
        
    }
    void recurse(int ind,int[] nums,List<List<Integer>> res,List<Integer> cur,int target){   
  
        if (target==0){
              List<Integer> temp=new ArrayList<>(cur);
              res.add(temp);          
              return;
        }
        
      for (int i=ind;i<nums.length;i++){
          if (i>ind && nums[i]==nums[i-1]) continue;
          if (nums[i]>target) break;
          cur.add(nums[i]);
          recurse(i+1,nums,res,cur,target-nums[i]);        
          cur.remove(cur.size()-1);
        
      }
       return;
    
    }
}