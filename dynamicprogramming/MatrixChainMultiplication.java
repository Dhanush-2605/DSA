import java.util.*;
public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50};
        int n=nums.length;
        int[][] dp=new int[n][n];
        // for (int[] row:dp) Arrays.fill(row,-1);
        for (int i=n-1;i>=1;i--){
            for (int j=i+1;j<n;j++){
                int max=1000000000;
                for (int k=i;k<=j-1;k++){
                    int steps=nums[i-1]*nums[k]*nums[j] + dp[i][k]+dp[k+1][j];
                    max=Math.min(max,steps);
                }
                dp[i][j]=max;  
            }


        }
        System.out.println(Arrays.deepToString(dp));

        System.out.println(dp[1][n-1]);
    }
    // static int recurse(int i,int j,int[] nums,int[][] dp){
    //     if (i==j) return 0;
    //     if (dp[i][j]!=-1) return dp[i][j];
    //     int max=1000000000;
    //     for (int k=i;k<=j-1;k++){
    //         int steps=nums[i-1]*nums[k]*nums[j] + recurse(i,k,nums,dp)+recurse(k+1,j,nums,dp);
    //         max=Math.min(max,steps);
    //     }
    //     return dp[i][j]=max;
    // }   
    
}
