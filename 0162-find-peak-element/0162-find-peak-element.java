class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
      int l=0;
        int r=n-1;
        while (r>=l){
            int mid=l+(r-l)/2;
         
            if (mid<n-1 && arr[mid]<arr[mid+1]) l=mid+1;
            else if (mid>0 && arr[mid]<arr[mid-1]) r=mid-1;
            else return mid;
            
        }
        return -1;     
    }
}