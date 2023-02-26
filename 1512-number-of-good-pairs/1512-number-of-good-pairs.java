class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        for (int num:nums){
            int count=map.getOrDefault(num,0);
            res+=count;
            map.put(num,count+1);
   
        }
        return res;
    }
}