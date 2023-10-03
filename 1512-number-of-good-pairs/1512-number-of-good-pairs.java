class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        for (int num:nums){
            int ctn=map.getOrDefault(num,0);
            res+=ctn;
            map.put(num,ctn+1);
        }
        return res;
        
    }
}