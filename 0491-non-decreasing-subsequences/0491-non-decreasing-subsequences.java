class Solution {
    Set<List<Integer>> res=new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
     List<List<Integer>> ans=new ArrayList<>();
        List<Integer> cur=new ArrayList<>();
        recurse(0,nums,ans,cur);
        for (List<Integer> l:res) ans.add(l);
        return ans;
    }
    void recurse(int ind,int[] nums,List<List<Integer>> ans,List<Integer> cur){
        if (cur.size()>=2){
            List<Integer> temp=new ArrayList<>(cur);
            res.add(temp); 
            
         // return;
        }
        
        for (int i=ind;i<nums.length;i++){
            

                if (cur.size()==0 || nums[i]>=cur.get(cur.size()-1)){
                    cur.add(nums[i]);
                    recurse(i+1,nums,ans,cur);
                    cur.remove(cur.size()-1);
              
                }
            

        
        
        
    }
}
}