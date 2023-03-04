class Solution {
    public int findMin(int[] arr) {
       int res=BinarySearch(arr);
       if (res==-1) return arr[0];
       return arr[res];
    }
    int BinarySearch(int[] arr){
		int l=0;
		int r=arr.length-1;
		while (r>=l){
		    int mid=l+(r-l)/2;
		    if (mid+1<arr.length && arr[mid+1]<arr[mid]) return mid+1;
		    if (arr[mid]>=arr[l]){
		        l=mid+1;
		    }else{
		        r=mid-1;
		    }
		} 
        return -1;
    }
}