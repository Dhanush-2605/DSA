class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp=new int[n+1];    
        for (int ind=n-1;ind>=0;ind--){
            int max=Integer.MIN_VALUE;
            int len=0;
            int maxRes=Integer.MIN_VALUE;
            for (int i=ind;i<Math.min(ind+k,n);i++){
                len++;
                max=Math.max(max,arr[i]);
                int sum=(len)*max+dp[i+1];
                maxRes=Math.max(maxRes,sum);
            
            
        }
         dp[ind]=maxRes;      
        }
        return dp[0];
        
    }

}