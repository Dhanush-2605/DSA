class Solution {
    public int tallestBillboard(int[] rods) {
        int offset=5000;
        int n=rods.length;
        int[][] dp=new int[n][2*offset+1];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        return recurse(0,0,dp,n,rods);
        
        
    }
    int recurse(int ind,int diff,int[][] dp,int n,int[] rods){
        if (ind==n){
            if (diff==0) return 0;
            else return Integer.MIN_VALUE;
        }
        if (dp[ind][diff+5000]!=-1) return dp[ind][diff+5000];
        
        int notTake=recurse(ind+1,diff,dp,n,rods);
        int left=rods[ind]+recurse(ind+1,diff+rods[ind],dp,n,rods);
        int right=recurse(ind+1,diff-rods[ind],dp,n,rods);
        int res=Math.max(notTake,left);
        res=Math.max(res,right);
        return dp[ind][diff+5000]=res;
        
        
    }
}