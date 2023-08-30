class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int val:nums){
            if (map.containsKey(val)) map.put(val,map.get(val)+1);
            else map.put(val,1);
        }        
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()%2!=0) return false;
        }
        return true;
        
    }
}