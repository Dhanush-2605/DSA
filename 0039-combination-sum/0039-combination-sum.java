class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        recurse(0,target,cur,res,candidates);
        return res;
        
    }
    void recurse(int ind,int target,List<Integer> cur,List<List<Integer>> res,int[] candidates){
        // int take=u
        if (ind>=candidates.length){
         if (target==0) res.add(new ArrayList<>(cur));
            return;
        }
        if (target>=candidates[ind]){
            cur.add(candidates[ind]);
            recurse(ind,target-candidates[ind],cur,res,candidates);
            cur.remove(cur.size()-1);
        }
        recurse(ind+1,target,cur,res,candidates);
        
    }
}