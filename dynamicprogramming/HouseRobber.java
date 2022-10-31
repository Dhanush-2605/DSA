public class HouseRobber {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int[] dp=new int[nums.length];
         System.out.println(func(nums,dp));

         //recursive part
       
         for (int i=0;i<nums.length;i++){
             dp[i]=-1;
         }
         System.out.println(recurse(nums.length-1,dp,nums));
        
    }
    //Iterative part
    // TC->O(N)
    // SC->O(N)

    static int func(int[] nums,int[] dp){
      if (nums.length==1) return nums[0];
      if (nums.length==2) return Math.max(nums[0],nums[2]);
        for (int i=3;i<nums.length;i++){
            dp[i]=Math.max(nums[i-2],nums[i-1])+nums[i];
        
        }
    return Math.max(dp[nums.length-1],dp[nums.length-2]);

    }
    
    //DP Recursive and memoization
    // TC->O(N)
    // SC->O(N)+O(N)
    static int recurse(int n,int[] dp,int[] nums){
        if (n==0) return nums[n];
        if (n<0) return 0;
         if (dp[n]!=-1) return dp[n];
        int count=nums[n]+recurse(n-2,dp,nums);
        int notCount=recurse(n-1,dp,nums);
        dp[n]=Math.max(count,notCount);
        return Math.max(count,notCount);
    }
}
