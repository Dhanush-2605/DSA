class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        
    int[][] dp = new int[triangle.size()][triangle.get(triangle.size() - 1).size()];
        
        for (int i=n-1;i>=0;i--){
            for (int j=i;j>=0;j--){
                if (i==n-1) dp[i][j]=triangle.get(i).get(j);
                else{
                 
                  int r1=triangle.get(i).get(j) + dp[i+1][j];
                  int r2=triangle.get(i).get(j) + dp[i+1][j+1];
                    dp[i][j]=Math.min(r1,r2);  
                }
                
            }
       
        }
        return dp[0][0];
        
    }
}
