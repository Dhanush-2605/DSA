public class CountPartitionsWithGivenDiff {
    public static void main(String[] args) {
        int[] nums={1,2,6,4};
        int d=3;
        int sum=0;
        for (int i=0;i<nums.length;i++) sum+=nums[i];
        int tar=(sum-d)/2;
        int[][] dp=new int[nums.length][tar+1];
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<tar+1;j++){
                dp[i][j]=-1;
            }
        }
        // if (sum-d<0 || (sum-d)%2!=0) return 0;

        System.out.println(recurse(nums.length-1, tar, nums,dp));

    }
    static int recurse(int ind,int target,int[] nums,int[][] dp){
        // if (nums[ind]==target) return 1;
        if (target==0) return 1;
        if (ind==0){
            if (nums[ind]==target) return 1;
            else return 0;
        };
        if (dp[ind][target]!=-1) return dp[ind][target];
        int unTake=recurse(ind-1,target,nums,dp);
        int take=0;
        if (target>=nums[ind]) take=recurse(ind-1, target-nums[ind], nums,dp);
        dp[ind][target]=unTake+take;
        return unTake+take;

    }
    
}
