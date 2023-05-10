class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> cur=new ArrayList<>();
        Arrays.sort(nums);
        helper(cur,0,nums.length,nums);
        return res;
    }
    void helper(ArrayList<Integer> cur,int ind,int n,int[] nums){
        if (ind>=n){
            ArrayList<Integer> temp=new ArrayList<>(cur);
            res.add(temp);
            return;
        }
        
        cur.add(nums[ind]);
        helper(cur,ind+1,n,nums);
        cur.remove(cur.size()-1);
        
        while (ind+1<n && nums[ind]==nums[ind+1]) ind++;
        helper(cur,ind+1,n,nums);
        
    }
}