
//Frog jump using k steps. To find minimum cost

//using memoization
// TC-O(N)*k
// SC-O(N)+O(N) dp array space + stack space
// public class FrogJumps {
//     public static void main(String[] args) {
//         int[] cost={30,20,30,40}; 
//         int[] dp=new int[cost.length+1]; 
//         for (int i=0;i<cost.length+1;i++){
//             dp[i]=-1;
//         }
//        int res=recurse(cost.length-1,dp,cost,4);
        


//         System.out.println(res);
        
//     }
//     static int recurse(int n,int[] res,int[] arr,int k){
//         if (n==0) return 0;
//         if (res[n]!=-1) return res[n];
//         int minValue=Integer.MAX_VALUE;
//         for (int i=1;i<=k;i++){
//             if (n-i>=0){
//             int step=recurse(n-i,res,arr,k)+Math.abs(arr[n]-arr[n-i]);
//             minValue=Math.min(minValue,step);
//             }

//         }
//         res[n]=minValue;
//         return minValue;

        
//     } 
// }


//using tabulation

// TC-O(N)*k
// SC-O(N) dp array space

public class FrogJumps {
    public static void main(String[] args) {
        int[] cost={30,20,30,40}; 
        int[] dp=new int[cost.length+1]; 
        dp[0]=0;
  
       int res=Iterative(cost.length-1,dp,cost,4);
        


        System.out.println(res);
        
    }
    static int Iterative(int n,int[] res,int[] arr,int k){
      
        int minValue=Integer.MAX_VALUE;
        for (int j=1;j<n;j++){
            for (int i=1;i<=k;i++){
                if (j-i>=0){
                    int step=res[j-1]+Math.abs(arr[j]-arr[j-i]);
                    minValue=Math.min(minValue,step);
            }

        }
        res[j]=minValue;
    }
       
        return minValue;

        
    } 
}
