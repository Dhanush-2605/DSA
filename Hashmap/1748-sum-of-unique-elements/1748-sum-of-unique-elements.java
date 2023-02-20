class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for (int i=0;i<n;i++){
            int cur=nums[i];
            if (map.containsKey(cur)) map.put(cur,map.get(cur)+1);
            else map.put(cur,1);
        }
        int sum=0;
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()==1) sum+=entry.getKey();
        }
        return sum;
        
    }
}