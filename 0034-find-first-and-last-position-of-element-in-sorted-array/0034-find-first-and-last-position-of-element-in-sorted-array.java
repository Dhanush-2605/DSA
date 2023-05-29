class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
         res[0]=binarySearch(0,nums.length-1,true,nums,target);
         res[1]=binarySearch(0,nums.length-1,false,nums,target);
        
 
     return res;   
    }
    int binarySearch(int l,int r,boolean isLeft,int[] nums,int target){
      int ind=-1;
        while (r>=l){
            int mid=l+(r-l)/2;
     
          if (nums[mid]<target) l=mid+1;            
          else if (nums[mid]>target) r=mid-1;
            else{
                 ind=mid;                
                if (isLeft) r=mid-1;        
                else l=mid+1;
            }
        }    
        return ind;
    }
}