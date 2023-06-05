class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int ans=recurse(0,nums.length-1,nums,true);
        System.out.println(ans);
        int sum=0;
        for (int val:nums){
            sum+=val;
        }
        sum=sum-ans;
        
        return ans>=sum;
        
    }
    int recurse(int s,int e,int[] nums,boolean t){
        if (s>e) return 0;  
    
        if (t){           
           int take=nums[s]+recurse(s+1,e,nums,!t);         
            int notTake=nums[e]+recurse(s,e-1,nums,!t);
            return Math.max(take,notTake);           
            
        }
        else{           
            int take=recurse(s+1,e,nums,!t);          
            int notTake=recurse(s,e-1,nums,!t);   
            return Math.min(take,notTake);
        }
        // return 0;
    }
}