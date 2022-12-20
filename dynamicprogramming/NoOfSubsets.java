import java.util.Arrays;

// TC-> O(n*target)
// SC-> O(n*target) +O(N)

// if we didn't use dp array then TC is 2 power n

//IMPORTANT MODEL


// public class NoOfSubsets {
//     public static void main(String[] args) {
//         int[] nums={1,2,2,3};
//         int sum=3;
//         int[][] dp=new int[nums.length][sum+1];
//         System.out.println(recurse(nums.length-1, sum, nums,dp));

//     }
//     static int recurse(int ind,int target,int[] nums,int[][] dp){
//      
//         if (ind==0){
//             if (nums[ind]==0 && nums[ind]==target) return 2;
                // if (nums[ind]!=0 && target<=0) return 1;
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
        int[] nums={0,0,1};
        int sum=1;
        int[][] dp=new int[nums.length][sum+1];
        if (nums[0]==0) dp[0][0]=2;
        else dp[0][0]=1;
        
        if (nums[0]!=0 && nums[0]<=sum) dp[0][nums[0]]=1;    
        for (int ind=1;ind<nums.length;ind++){
            for (int target=0;target<=sum;target++){
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