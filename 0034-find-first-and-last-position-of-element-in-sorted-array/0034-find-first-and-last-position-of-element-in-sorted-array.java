class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ind1=binSearch(nums,target,true); 
        int ind2=binSearch(nums,target,false); 
        int[] res=new int[2];

        res[0]=ind1;
        res[1]=ind2;
        return res;
        
    }
    int binSearch(int[] nums,int target,boolean isLeft){
        int l=0;
        int r=nums.length-1;
        int ind=-1;
        while (r>=l){
            int mid=l+(r-l)/2;          
            
            if (nums[mid]>target) r=mid-1;
            else if (nums[mid]<target) l=mid+1;
           

            else{
                ind=mid;
                if (isLeft) r=mid-1;
                else l=mid+1;
                
            }            
            
        }
        return ind;
    }

}