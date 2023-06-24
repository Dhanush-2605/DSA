class Solution {
    public void sortColors(int[] nums) {
        helper(nums,0,nums.length-1);              
        
    }

    void helper(int[] arr,int start,int end){
        if (start>=end) return;
        int pivot=start;
        int s=start+1;
        int e=end;
        while (e>=s){
        if (arr[pivot]<arr[s] && arr[pivot]>arr[e]){
        int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
   
        }
        if (arr[pivot]>=arr[s]) s++;
        if (arr[e]>=arr[pivot]) e--;
        }
        int temp=arr[e];
            arr[e]=arr[pivot];
            arr[pivot]=temp;
        helper(arr,start,e-1);
        helper(arr,e+1,end);
    }
}