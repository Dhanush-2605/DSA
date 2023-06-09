class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for (int val:arr){
            if (map.containsKey(val)) map.put(val,map.get(val)+1);
            else map.put(val,1);
        }
         for (Map.Entry<Integer,Integer> entry : map.entrySet()){
             set.add(entry.getValue());             
         }
        if (map.size()==set.size()) return true;
         return false;
            
        
        
        
    }
}