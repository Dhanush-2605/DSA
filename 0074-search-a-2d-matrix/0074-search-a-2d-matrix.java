class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean res=false;
        
        for (int[] arr:matrix){
            res=res || binary(arr,target);
        }
        return res;
        
    }
    boolean binary(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while (e>=s){
           int mid=s+(e-s)/2;
           if (arr[mid]==target) return true;
            
            if (arr[mid]>target) e=mid-1;
            else s=mid+1;
            
        }
            return false;
        
    }
}