class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int[] arr:nums){
            for (int val:arr){
                if (map.containsKey(val)) map.put(val,map.get(val)+1);
                else map.put(val,1);
            }
        }
        int len=nums.length;
        List<Integer> res=new ArrayList<>();
       for (Map.Entry<Integer,Integer> entry : map.entrySet()){
           if (entry.getValue()==len) res.add(entry.getKey());

       }
       Collections.sort(res);
        return res;
    }
}