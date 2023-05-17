class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        int[] rem=new int[n];
        for (int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int c=0;
        for (int i=0;i<n;i++){
            rem[i]=(prefix[i])%k;
            if (rem[i]<0) rem[i]+=k;
            if (map.containsKey(rem[i])){
                c+=map.get(rem[i]);
                map.put(rem[i],map.get(rem[i])+1);
            }
            else{
                map.put(rem[i],1);
            }
        }
        return c;
        
    }
}