class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        
        for (int value:map.values()){
            if (value>1){
                return true;
            }
        }
        
        return false;
        
    }
}