class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] res=new int[n];
        int ind=0;
        int ctn=0;
        for (int i=0;i<n;i++){
            if (nums[i]==pivot){
                ctn++;
            
            }
            if (nums[i]<pivot){
                res[ind++]=nums[i];
              
            }
        }
    
        for (int i=0;i<ctn;i++){
            res[ind]=pivot;
            ind++;
            
        }


       for (int i=0;i<n;i++){
            if (nums[i]>pivot && ind<n){
                res[ind]=nums[i];
                ind++;
            }
        }
        return res;
        
        
    }
}