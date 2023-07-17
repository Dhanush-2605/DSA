class Solution {
    public int matrixSum(int[][] nums) {
        int sum=0;
        int c=nums[0].length;
        int r=nums.length;
        for (int[] arr:nums){
            Arrays.sort(arr);
        }
        for (int i=c-1;i>=0;i--){
            int res=0;
            for(int[] arr:nums){
                res=Math.max(res,arr[i]);               
                
            }
            sum+=res;
     
            
        }
        return sum;
        
    }
}