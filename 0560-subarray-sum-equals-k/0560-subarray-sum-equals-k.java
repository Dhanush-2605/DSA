class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        int sum=0;
        for (int i=0;i<nums.length;i++){
            map.put(sum,map.getOrDefault(sum,0)+1);
            sum+=nums[i];
            if (map.containsKey(sum-k)){
                res+=map.get(sum-k);
            }
        }
        return res;
    }
}