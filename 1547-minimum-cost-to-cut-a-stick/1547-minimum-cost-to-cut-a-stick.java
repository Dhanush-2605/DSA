class Solution {
    public int minCost(int n, int[] cuts) {
        int[] cutArr=new int[cuts.length+2];
        Arrays.sort(cuts);
        int len=cuts.length;
        int[][] dp=new int[len+1][len+1];
        for (int[] row:dp) Arrays.fill(row,-1);
        for (int i=1;i<=cuts.length;i++){
            cutArr[i]=cuts[i-1];
        }
        cutArr[cuts.length+1]=n;
        System.out.println(Arrays.toString(cutArr));
        return recurse(1,cuts.length,cutArr,dp);
        
    }
    int recurse(int i,int j,int[] cuts,int[][] dp){
        if (i>j) return 0;
        if (dp[i][j]!=-1) return dp[i][j];
        int min=Integer.MAX_VALUE;
        for (int ind=i;ind<=j;ind++){
            int cost=cuts[j+1]-cuts[i-1]+recurse(i,ind-1,cuts,dp)+recurse(ind+1,j,cuts,dp);
            min=Math.min(cost,min);
        }
        return dp[i][j]=min;
    }
}
