import java.io.PipedInputStream;
import java.lang.reflect.Array;
import java.util.*;

//Recursive solution

// public class MinCostClimbingStairs {
//     public static void main(String[] args) {
//         int[] cost={10,15,20};
//         int[] arr=new int[cost.length+1];
//         for (int i=0;i<arr.length;i++){
//             arr[i]=-1;
//         }
               
 
//         int res= recurse(cost.length-1,arr,cost);        
//           System.out.println(Arrays.toString(arr));
//     }
//     static int recurse(int n,int[] res,int[] arr){
//         if (n==0) return 0;
//         if (res[n]!=-1) return res[n];
//         int left=recurse(n-1,res,arr)+Math.abs(arr[n]-arr[n-1]);
//         int right=Integer.MAX_VALUE;
//         if (n>1){
//           right= recurse(n-2,res,arr)+Math.abs(arr[n]-arr[n-2]);
//         }
//         return res[n]=Math.min(left,right);
        
//     }
// }


//Frog jump
// using DP and tabulation
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost={10,20,30,40}; 
        int dp=0;
        int l=dp;
        int r=dp;

        for (int i=1;i<cost.length;i++){
            int left=l+Math.abs(cost[i]-cost[i-1]);
            int right=Integer.MAX_VALUE;
            if (i>1){ 
                right=r+Math.abs(cost[i]-cost[i-2]);
                r=l;
            };

            dp=Math.min(left,right);
            l=dp;
        }
        System.out.println(dp);
               

    }

}


//Frog jump using k



// public class MinCostClimbingStairs {
//     public static void main(String[] args) {
//         int[] cost={10,20,30,40}; 
//         // int[] dp=new int[cost.length];
//         // dp[0]=0;
//         int[] dp=new int[12];
  


//         for (int i=1;i<cost.length;i++){
//             int left=l+Math.abs(cost[i]-cost[i-1]);
//             int right=Integer.MAX_VALUE;
//             if (i>1){ 
//                 right=r+Math.abs(cost[i]-cost[i-2]);
//                 r=l;
//             };

//             dp=Math.min(left,right);
//             l=dp;
//         }
//         System.out.println(dp);
               

//     }
//     static int recurse(int n,int[] res,int[] arr){
//         if (n==0) return 0;
//         if (res[n]!=-1) return res[n];
//         int left=recurse(n-1,res,arr)+Math.abs(arr[n]-arr[n-1]);
//         int right=Integer.MAX_VALUE;
//         if (n>1){
//           right= recurse(n-2,res,arr)+Math.abs(arr[n]-arr[n-2]);
//         }
//         return res[n]=Math.min(left,right);
        
//     }

// } 