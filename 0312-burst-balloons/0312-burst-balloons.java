class Solution {
    public int maxCoins(int[] nums) {
        int len=nums.length;
        int[][] dp=new int[len+2][len+2];      
        ArrayList<Integer> l=new ArrayList<Integer>();
        for (int i:nums) l.add(i);
        l.add(0,1);
        l.add(len+1,1);
        for (int i=len;i>=1;i--){
            for (int j=1;j<=len;j++){
                if (i>j) continue;
                int max=Integer.MIN_VALUE;
                for (int k=i;k<=j;k++){
                    int steps=l.get(i-1)*l.get(k)*l.get(j+1) + dp[i][k-1]+dp[k+1][j];
                    max=Math.max(max,steps);
        }
         dp[i][j]=max;              
            }
        }
    
        return dp[1][len];
        
    }

}