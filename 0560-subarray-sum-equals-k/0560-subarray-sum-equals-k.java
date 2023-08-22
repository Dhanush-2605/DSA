class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int ctn=0;
        int pSum=0;
        for (int i=0;i<nums.length;i++){
            pSum+=nums[i];
            int rem=pSum-k;
            if (map.containsKey(rem)){
             ctn+=map.get(rem);
            
            }
                    map.put(pSum,map.getOrDefault(pSum,0)+1);

        }
        return ctn;
        
    }
}