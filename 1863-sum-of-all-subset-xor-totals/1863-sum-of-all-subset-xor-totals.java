class Solution {
    int ans=0;
    public int subsetXORSum(int[] nums) {
        ArrayList<Integer> t2=new ArrayList<>();
        recurse(0,nums,t2);
        return ans;
    }
    void recurse(int i,int[] nums,ArrayList<Integer> temp){
        if (i>=nums.length){
            int res=0;
            ArrayList<Integer> t1=new ArrayList<>(temp);
            for (int val:temp){
                res=res^val;
            }
            ans+=res;
            
            return;            
        }
        recurse(i+1,nums,temp);
        temp.add(nums[i]);
        recurse(i+1,nums,temp);
        temp.remove(temp.size()-1);
        return;
    }
}