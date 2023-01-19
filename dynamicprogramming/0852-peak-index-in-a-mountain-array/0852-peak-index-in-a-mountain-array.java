class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int res=0;
        int l=0;
        int r=arr.length-1;
        while (r>=l){
            int mid=l+(r-l)/2;
            if (arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) return mid;
            if (arr[mid]>=arr[mid+1]) r=mid-1;
            else{
                l=mid+1;
            }
        }
 
        return res;
        
    }
}