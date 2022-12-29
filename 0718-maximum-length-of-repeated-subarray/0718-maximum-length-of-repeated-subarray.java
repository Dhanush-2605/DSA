class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[][] dp=new int[n1+1][n2+1];
        for (int i=0;i<=n1;i++) dp[i][0]=0;
        for (int j=0;j<=n2;j++) dp[0][j]=0;
        int res=0;
        for (int ind1=1;ind1<=n1;ind1++){
            for (int ind2=1;ind2<=n2;ind2++){
                if (nums1[ind1-1]==nums2[ind2-1]) dp[ind1][ind2]=1+dp[ind1-1][ind2-1];
                else dp[ind1][ind2]=0;
                res=Math.max(res,dp[ind1][ind2]);
            }
        }
        return res;
        
    }
}