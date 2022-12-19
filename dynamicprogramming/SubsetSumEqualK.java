import java.util.*;
// public class SubsetSumEqualK {
//     public static void main(String[] args) {
//    int[] nums={2,3,1,1,1};
//    int target=4;
//    HashMap<int[],Boolean> map=new HashMap<>();
//    System.out.println(recurse(nums.length-1, target, nums,map));
        
//     }
//     static boolean recurse(int ind,int target,int[] nums,HashMap<int[],Boolean> map){
//         if (target==0) return true;
//         if (ind==0){
//             return (nums[ind]==target);

//         }
//         int[] arr=new int[2];
//         arr[0]=ind;
//         arr[1]=target;
//         if (map.containsKey(arr)) return map.get(arr);
//         boolean unTake=recurse(ind-1,target,nums,map);
//         boolean take=false;
//         if (target>=nums[ind]){
//             take=recurse(ind-1,target-nums[ind],nums,map);
//         }
//         map.put(arr,(take||unTake));
//         return (take || unTake);

//     }
    
// }




public class SubsetSumEqualK {
    public static void main(String[] args) {
   int[] nums={2,3,1,1};
   int k=4;
   int n=nums.length;
//assume contraints  of index and target is 100
   boolean[][] dp=new boolean[100][100];
   for (int i=0;i<n;i++) dp[i][0]=true;
   dp[0][nums[0]]=true;
   for (int ind=1;ind<n;ind++){
    for (int target=1;target<=k;target++){
        boolean unTake=dp[ind-1][target];
        boolean take=false;
        if (target>=nums[ind]){
            take=dp[ind-1][target-nums[ind]];
        }
        dp[ind][target]=take||unTake;
    }
   }
   System.out.println(dp[n-1][k]);
        
    }
}
