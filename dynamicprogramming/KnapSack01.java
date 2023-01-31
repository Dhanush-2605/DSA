import java.util.Arrays;

//problem link
// LINK->https://www.codingninjas.com/codestudio/problem-details/0-1-knapsack_920542


// public class KnapSack01 {
//     public static void main(String[] args) {
//         int bagWeight=8;
//         int[] weights={3,2,5,7};
//         int[] value={30,50,60,20};
//         int[][] dp=new int[weights.length][bagWeight+1];
//         System.out.println(recurse(2, bagWeight,weights,value,dp));
//         System.out.println(Arrays.deepToString(dp));
//     }
//     static int recurse(int ind,int bagWeight,int[] weights,int[] value,int[][] dp){

//         if (ind==0){
//             if (bagWeight-weights[ind]>=0) return value[ind]; 
//             return 0;
//         }
//         if (bagWeight<=0) return 0;
//         if (dp[ind][bagWeight]!=0) return dp[ind][bagWeight];

//             int unTake=recurse(ind-1, bagWeight,weights,value,dp);
//             int take=0;
//             if (bagWeight-weights[ind]>=0){
//                 take=value[ind]+recurse(ind-1, bagWeight-weights[ind], weights, value,dp);
//             }
//             dp[ind][bagWeight]=Math.max(take, unTake);
//             return Math.max(take,unTake);

         

//     }
// }


public class KnapSack01 {
    public static void main(String[] args) {
        int bagWeight=4;
        int[] weights={2,1,3};
        int[] value={30,50,60};
        int[][] dp=new int[weights.length][bagWeight+1];
        for (int i=weights[0];i<=bagWeight;i++) dp[0][i]=value[0];
        for (int ind=1;ind<weights.length;ind++){
            for (int j=0;j<=bagWeight;j++){
                int unTake=0 + dp[ind-1][j];
                int take=-102000000;
                if (j>=weights[ind]){
                    take=value[ind]+dp[ind-1][j-weights[ind]];
                }
                dp[ind][j]=Math.max(take, unTake);   
            }
        }
        System.out.println(Arrays.deepToString(dp));

        System.out.println(dp[weights.length-1][bagWeight]);
        
    }
 
}
