class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        ArrayList<Integer> max=new ArrayList<>();
        while (r>l){
            int curSum=nums[l]+nums[r];
            max.add(curSum);
            l++;
            r--;
        }
        int res=Integer.MIN_VALUE;
        for (int i=0;i<max.size();i++){
            res=Math.max(res,max.get(i));
            }
            return res;
        
    }
}