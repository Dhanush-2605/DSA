class Solution {
    public int minCost(int n, int[] cuts) {
        int[] cutArr=new int[cuts.length+2];
        Arrays.sort(cuts);
        int len=cuts.length;
        System.out.println(len);
        int[][] dp=new int[len+2][len+2];
        for (int i=1;i<=cuts.length;i++){
            cutArr[i]=cuts[i-1];
        }
        cutArr[cuts.length+1]=n;
        System.out.println(Arrays.toString(cutArr));
        for (int i=len;i>=1;i--){
            for (int j=1;j<=len;j++){
                if (i>j) continue;
                int min=Integer.MAX_VALUE;
                for (int ind=i;ind<=j;ind++){
                    int cost=cutArr[j+1]-cutArr[i-1]+dp[i][ind-1]+dp[ind+1][j];
                    min=Math.min(cost,min);
                  }
              dp[i][j]=min;           
            }
        }
        return dp[1][cuts.length];
        
    }

}
