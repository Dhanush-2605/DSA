import java.util.Arrays;

// MEMOIZATION

// class RodCutting{
//     public static void main(String[] args) {
//         int n=5;
//         int[] price={2,5,7,8,10};
//         int[][] dp=new int[price.length][n+1];
//         for (int[] row:dp) Arrays.fill(row, -1);
//         System.out.println(recurse(price.length-1, n, price,dp));
//     }

//     static int recurse(int ind,int target,int[] price,int[][] dp){
//         if (ind==0){
//             if (target>=ind+1){
//                 int weight=ind+1;
//                 return ((int)target/weight)*price[ind];
//             }
//             else return 0;

//         }
//         if (dp[ind][target]!=-1) return dp[ind][target];
//         int unTake=recurse(ind-1,target,price,dp);
//         int take=Integer.MIN_VALUE;
//         int weight=ind+1;
//         if (target>=weight) take=price[ind] +recurse(ind, target-weight, price,dp);
//         dp[ind][target]=Math.max(take, weight);
//         return Math.max(take,unTake);
//     }
// }


// TABULATION



class RodCutting{
    public static void main(String[] args) {
        int n=5;
        int[] price={2,5,7,8,10};
        int[][] dp=new int[price.length][n+1];
        for (int i=0;i<=n;i++){
            dp[0][i]=i*price[0];
        }
  

        for (int ind=1;ind<price.length;ind++){
            for (int target=0;target<=n;target++){
                int unTake=dp[ind-1][target];
                int take=Integer.MIN_VALUE;
                int weight=ind+1;
                if (target>=weight) take=price[ind] +dp[ind][target-weight];               
                dp[ind][target]=Math.max(take, unTake);


            }
        }
        System.out.println(Arrays.deepToString(dp));

        System.out.println(dp[price.length-1][n]);
    }

    
}