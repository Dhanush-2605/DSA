import java.util.Arrays;

// public class UnboundKnapscak {
//     public static void main(String[] args) {
//         int[] weights={2,4,6};
//         int[] value={5,11,13};
//         int target=10;
//         int[][] dp=new int[weights.length][target+1];
//         for (int[] row:dp) Arrays.fill(row, -1);
//         System.out.println(recurse(weights.length-1,target,value,weights,dp));
//                  }
//      static int recurse(int ind,int target,int[] value,int[] weights,int[][] dp){
//         // if (target==0) return 0;
//         if (ind==0){
//             // if (target>=weights[0]){
//                 int count=(int)target/weights[0];
//                 return value[0]*count;
//             // }
//             // else return -1000000000;
//         }
//         if (dp[ind][target]!=-1) return dp[ind][target];

//         int unTake=0+recurse(ind-1, target, value,weights,dp);
//         int take=-1000000000;
//         if (target>=weights[ind]) take=value[ind]+recurse(ind, target-weights[ind], value,weights,dp);
//         dp[ind][target]=Math.max(unTake, take);
//         return Math.max(take,unTake);


//      }
    

// }


// Time Complexity: O(N*W)

// Space Complexity: O(N*W) + O(N)


public class UnboundKnapsack {
    public static void main(String[] args) {
        int[] weights={2,4,6};
        int[] value={5,11,13};
        int tar=10;
        int[][] dp=new int[weights.length][tar+1];
        for(int i=weights[0];i<=tar;i++){
            dp[0][i]=((int)i/weights[0])*value[0];
        }


        // System.out.println(recurse(weights.length-1,tar,value,weights,dp));
        for (int ind=1;ind<weights.length;ind++){
         for (int target=0;target<=tar;target++){
            int unTake=0+dp[ind-1][target];
            int take=Integer.MIN_VALUE;
            if (target>=weights[ind]) take=value[ind]+dp[ind][target-weights[ind]];
            dp[ind][target]=Math.max(unTake, take);  
            }
        }
        System.out.println(Arrays.deepToString(dp));

                System.out.println(dp[weights.length-1][tar]);

    }
  

}
