class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int val:nums){
            if (map.containsKey(val)) map.put(val,map.get(val)+1);
            else map.put(val,1);
        }
        int n=nums.length;
        int res=0;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){ 
            res+=(entry.getValue()/2);
           
        
      }
        if (res==(n/2)) return true;
        return false;
        
        
    }
}