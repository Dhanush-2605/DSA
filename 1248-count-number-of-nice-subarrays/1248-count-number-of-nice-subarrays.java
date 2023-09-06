class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        for (int i=0;i<n;i++){
            if (nums[i]%2==0){
                nums[i]=0;
            }
            else nums[i]=1;
        }
        HashMap<Integer,Integer> map=new HashMap<>();     
        int pSum=0;
        int ctn=0;
        map.put(0,1);
        for (int i=0;i<n;i++){
            pSum+=nums[i];
            int rem=pSum-k;
            if (map.containsKey(rem)){
                ctn+=map.get(rem);
            }
            map.put(pSum,map.getOrDefault(pSum,0)+1);
            
        }
        return ctn;
        
    }
}