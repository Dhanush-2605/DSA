class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> temp1=new ArrayList<>();
        recurse(0,nums,res,temp1);
        return res;
        
    }
    void recurse(int ind,int[] nums,List<List<Integer>> res,List<Integer> cur){
        if (ind>=nums.length){
            List<Integer> temp=new ArrayList<>(cur);
            res.add(temp);
            return;
        }
        cur.add(nums[ind]);
        recurse(ind+1,nums,res,cur);
        cur.remove(cur.size()-1);
        
        while (ind+1<nums.length && nums[ind]==nums[ind+1]) ind++;
        recurse(ind+1,nums,res,cur);
    }
}