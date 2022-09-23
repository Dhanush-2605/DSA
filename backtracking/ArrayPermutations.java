import java.util.*;
public class ArrayPermutations {

    public static void main(String args[]){
        int[] nums={1,2,3};
        System.out.println(permute(nums));

    }
    static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,0, ans  );
        return ans;
    }
    static public void swap(int i, int n, int[]nums ){
        int temp = nums[i];
        nums[i] = nums[n];
        nums[n] =temp;
    }

    static public void helper(int[] nums, int n, List<List<Integer>> ans ){
        if(n == nums.length  ){
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<nums.length ;i++){
                temp.add(nums[i]);
            }
            ans.add(temp);
            return;
        }
        
        for(int i= n ;i< nums.length; i++){
            swap(i,n,nums );
            helper(nums,n+1,ans );
            swap(i,n,nums);
        }
        return;
    }
    
}
