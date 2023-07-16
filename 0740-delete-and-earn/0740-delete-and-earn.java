class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        ArrayList<Integer> values=new ArrayList<>();
        for (int vals:nums) values.add(vals);
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int val:nums){
            if (map.containsKey(val)){
                values.remove(Integer.valueOf(val));
                map.put(val,map.get(val)+1);
            }
            else map.put(val,1);
        }
        int[] dp=new int[values.size()];
     
        dp[0]=map.get(values.get(0))*values.get(0);
        for (int i=1;i<values.size();i++){
            int val=map.get(values.get(i))*values.get(i);
            if (i-1>=0 && values.get(i)==values.get(i-1)+1){
                if (i-2>=0) dp[i]=Math.max(dp[i-1],val+dp[i-2]);
                else dp[i]=Math.max(dp[i-1],val);
            }
            else{
                  dp[i]=val+dp[i-1];
            }
        }
        return dp[values.size()-1];

        
    }

}