package BinarySearch;

// Link -> https://leetcode.com/discuss/interview-question/algorithms/124724/facebook-onsite-count-occurrences-of-a-number-in-a-sorted-array

public class OccurElemSortedArray {
    public static void main(String[] args) {
        int[] nums={1,2,2,2,3,3,3,8,8,8,9,10};
        int target=8;
        int res=binarySearch(nums,target,false)-binarySearch(nums,target,true);   
        System.out.println(res+1);
          
    }
    static int binarySearch(int[] nums,int tar,boolean isLeft){
        int l=0;
        int r=nums.length-1;
            int ind=-1;
    
        while (r>=l){
        int mid=l+(r-l)/2;
        if (nums[mid]<tar){
            l=mid+1;
        }
        else if (nums[mid]>tar){
            r=mid-1;
        }
        else{
            ind=mid;
            if (isLeft){
                r=mid-1;
            }else{
                l=mid+1;
            }
    
        }
        }
        return ind;
    
        }
    
}
