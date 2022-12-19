import java.util.Arrays;

// TC-> O(n*target)
// SC-> O(n*target) +O(N)

// if we didn't use dp array then TC is 2 power n


// public class NoOfSubsets {
//     public static void main(String[] args) {
//         int[] nums={1,2,2,3};
//         int sum=3;
//         int[][] dp=new int[nums.length][sum+1];
//         System.out.println(recurse(nums.length-1, sum, nums,dp));

//     }
//     static int recurse(int ind,int target,int[] nums,int[][] dp){
//         // if (nums[ind]==target) return 1;
//         if (target==0) return 1;
//         if (ind==0){
//             if (nums[ind]==target) return 1;
//             else return 0;
//         };
//         if (dp[ind][target]!=0) return dp[ind][target];
//         int unTake=recurse(ind-1,target,nums,dp);
//         int take=0;
//         if (target>=nums[ind]) take=recurse(ind-1, target-nums[ind], nums,dp);
//         dp[ind][target]=unTake+take;
//         return unTake+take;

//     }
    
// }


public class NoOfSubsets {
    public static void main(String[] args) {
        // int[] nums={1,2,2,3};
        int[] nums={3,5,6,7};
        int sum=9;
        int[][] dp=new int[nums.length][sum+1];
        for (int i=0;i<nums.length;i++) dp[i][0]=1;
        if (nums[0]<=sum) dp[0][nums[0]]=1;
        for (int ind=1;ind<nums.length;ind++){
            for (int target=1;target<=sum;target++){
                int unTake=dp[ind-1][target];
                int take=0;
                if (target>=nums[ind]) take=dp[ind-1][target-nums[ind]];
                dp[ind][target]=unTake+take;
            }
        }
        System.out.println(Arrays.deepToString(dp));
System.out.println(dp[nums.length-1][sum]);

    }

    
}