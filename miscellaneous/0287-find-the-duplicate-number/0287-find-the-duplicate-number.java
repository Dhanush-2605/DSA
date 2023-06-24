class Solution {
    public int findDuplicate(int[] arr) {
        cyclic(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=i+1){
                return arr[i];
            }
        }
        return 0;
        
    }
    static void cyclic(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctInd=arr[i]-1;
            if (arr[i]==arr[correctInd]){
                i++;
            }
            else if (arr[i]!=i+1){
                swap(arr,i,correctInd);
            }
            else{
                i++;
            }
        }
}
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        
    }
    
}