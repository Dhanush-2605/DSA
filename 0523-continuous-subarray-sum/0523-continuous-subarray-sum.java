class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int pSum=0;

        for (int i=0;i<nums.length;i++){
            pSum+=nums[i];
            int rem=pSum%k;
            if (!map.containsKey(rem)){
                    map.put(rem,i);
            }
           if ((i-map.get(rem))>1) return true;

        }
        return false;
    }
}