import java.util.*;
public class PrintLCIS {
    public static void main(String[] args) {
        int[] nums={5,4,11,1,16,8};
        int n=nums.length;
        int[] dp=new int[n];
        int[] hash=new int[n];
        for (int i=0;i<n;i++) hash[i]=i;
        Arrays.fill(dp,1);
        
        for (int ind=0;ind<n;ind++){
            for (int prev=0;prev<ind;prev++){
            if (nums[ind]>nums[prev]){
                dp[ind]=Math.max(1+dp[prev],dp[ind]);
                hash[ind]=prev;
                // prev=i;
            }
        }
        }
        int max=0;
        for (int i=0;i<n;i++){
            if (dp[i]>max) max=dp[i];
        }
        System.out.println(Arrays.toString(dp));

       System.out.println(Arrays.toString(hash));
    }
    
}
