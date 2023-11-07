class Solution {
    Set<List<Integer>> set=new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> temp=new ArrayList<>();
        for (int val:nums) temp.add(val);
        permutation(temp,0);
        List<List<Integer>> res=new ArrayList<>();
        for (List<Integer> c:set) res.add(c);
        return res;
        
        
        
    }
    
    void swap(List<Integer> temp,int s,int e){
        int cur=temp.get(s);
        temp.set(s,temp.get(e));
        temp.set(e,cur);
    }
    
    void permutation(List<Integer> temp,int ind){
        if (ind==temp.size()-1){
            List<Integer> cur=new ArrayList<>(temp);
            set.add(cur);
            return;
        }
        for (int i=ind;i<temp.size();i++){
            swap(temp,ind,i);
            permutation(temp,ind+1);
            swap(temp,ind,i);
        }
        return;
    }
}