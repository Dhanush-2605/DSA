class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int val:nums){
            if (map.containsKey(val)) map.put(val,map.get(val)+1);
            else map.put(val,1);
        }
        int max=-1;
        int res=0;
       for (Map.Entry<Integer,Integer> entry : map.entrySet()){
           if (entry.getValue()>max){
               max=entry.getValue();
               res=entry.getKey();
           }

       }
        return res;
    }
}