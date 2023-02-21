class Solution {
    public int minimumOperations(int[] nums) {
        // PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->a-b);
        int[] q=nums;
        Arrays.sort(q);     
        int count=0;
        for (int i=0;i<nums.length;i++){            
            if (checkZero(nums)) return count;            
            int top=q[i];
            if (top==0) continue;
            count++;

            for (int j=0;j<nums.length;j++) nums[j]=nums[j]-top;
        }
        return count;
    }
    boolean checkZero(int[] nums){
        for (int i=0;i<nums.length;i++) if (nums[i]!=0) return false;
            return true;

    }
}