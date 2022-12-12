class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i=0;i<n;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
         for (Map.Entry<Integer,Integer> entry : map.entrySet()){ 
             if (entry.getValue()>n/3){
                 res.add(entry.getKey());
             }
        
         }
        return res;
    }
        
        
    }
