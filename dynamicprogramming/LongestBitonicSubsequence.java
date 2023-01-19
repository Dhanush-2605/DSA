import java.util.*;
public class LongestBitonicSubsequence{
    public static void main(String[] args) {
        int[] arr={1,11,2,10,4,5,2,1};
        int len=arr.length;
        // int[] dp=new int[len];
        // int[] dp1=new int[len];
        // int glob_max=0;

        // Arrays.fill(dp,1);
        // Arrays.fill(dp1,1);
        // for (int i=1;i<len;i++){
        //     // dp[i]=1;
        //     for (int prev=0;prev<i;prev++){
        //         if (arr[i]>arr[prev] && 1+dp[prev]>dp[i]){
        //             dp[i]=1+dp[prev];
        //         }
        //         if (arr[i]<arr[prev] && 1+dp1[prev]>dp1[i]) dp1[i]=1+dp1[prev];
        //     }

        // }
        // for (int i=0;i<len;i++){
        //     int cur_max=dp[i]+dp1[len-i-1];
        //     if (glob_max<cur_max) glob_max=cur_max;

        // }
        // System.out.println(Arrays.toString(dp));
        // System.out.println(Arrays.toString(dp1));
        // System.out.println(glob_max);
        // int len=arr.length;
        int[] dp=new int[len];
        int[] dp1=new int[len];
        int glob_max=-1;

        Arrays.fill(dp,1);
        Arrays.fill(dp1,1);
        for (int i=1;i<len;i++){         
            for (int prev=0;prev<i;prev++){
                if (arr[i]>arr[prev] && 1+dp[prev]>dp[i]){
                    dp[i]=1+dp[prev];
                }
            }
        }
            for (int i=len-1;i>=0;i--){         
            for (int prev=len-1;prev>i;prev--){
                if (arr[i]>arr[prev] && 1+dp1[prev]>dp1[i]){
                    dp1[i]=1+dp1[prev];
                }
            }
            }
        int g1_max=-1;
        for (int i=0;i<len;i++){
            int cur_max=dp[i]+dp1[i];
            if (g1_max<cur_max) g1_max=cur_max;
        }  
       
        System.out.println(g1_max-1);

        

    }
    
}
