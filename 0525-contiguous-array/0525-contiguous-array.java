class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int s=0;
        int e=0;
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<n;i++){
            if (nums[i]==0) nums[i]=-1;
        }
        map.put(0,-1);
        int pSum=0;
        for (int i=0;i<n;i++){
            pSum+=nums[i];
            if (map.containsKey(pSum)){
                res=Math.max(res,i-map.get(pSum));
            }
            else map.put(pSum,i);
        }
        
        
     

        return res;
    }
}