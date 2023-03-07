class Solution {
    public int arrayPairSum(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        for (int i=0;i<nums.length;i++) res.add(nums[i]);
         Collections.sort(res, Collections.reverseOrder());
        int ans=0;
        int s=0;
        int e=1;
        while (e<nums.length){
            ans+=Math.min(res.get(s),res.get(e));
            s+=2;
            e+=2;
            
        }
        return ans;

        
    }
}