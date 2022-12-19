class Solution {
    public int lastStoneWeightII(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        boolean dp[][]=new boolean[n][totalsum+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(nums[0]<=totalsum)
            dp[0][nums[0]]=true;
        for (int index=1;index<n;index++){
            for(int target=1;target<=totalsum;target++){
                boolean nottaken= dp[index-1][target];
                boolean taken=false;
                if(nums[index]<=target)
                     taken =dp[index-1][target-nums[index]];
                dp[index][target]=nottaken||taken;
                
            }
        }
        
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<=totalsum/2;i++){
            if(dp[n-1][i]==true){
                int s1=i;
                int s2=totalsum-i;
                int diff=s2-s1;
                mini=Math.min(mini, diff);
                
            }
        
            }
        return mini;  
    }
}
