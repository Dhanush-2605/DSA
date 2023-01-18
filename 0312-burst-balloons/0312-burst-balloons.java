class Solution {
    public int maxCoins(int[] nums) {
        int len=nums.length;
        int[][] dp=new int[len+1][len+1];
        for (int[] row:dp) Arrays.fill(row,-1);
        ArrayList<Integer> l=new ArrayList<Integer>();
        for (int i:nums) l.add(i);
        l.add(0,1);
        l.add(len+1,1);
        // Collections.sort(l);
        return recurse(1,len,l,dp);
        
    }
    int recurse(int i,int j,ArrayList<Integer> nums,int[][] dp){
        if (i>j) return 0;
        if (dp[i][j]!=-1) return dp[i][j];
        int max=Integer.MIN_VALUE;
        for (int k=i;k<=j;k++){
            int steps=nums.get(i-1)*nums.get(k)*nums.get(j+1) + recurse(i,k-1,nums,dp)+recurse(k+1,j,nums,dp);
            max=Math.max(max,steps);
        }
        return dp[i][j]=max;
    }
}