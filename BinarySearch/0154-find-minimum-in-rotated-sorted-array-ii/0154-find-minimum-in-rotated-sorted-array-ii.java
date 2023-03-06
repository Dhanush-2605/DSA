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
            if (arr[mid]<arr[r]) r=mid;
		    else if (arr[mid]==arr[r]){
		        r=r-1;
		    }else{
		        l=mid+1;
		    }
		} 
        return l;
    }    
    
}