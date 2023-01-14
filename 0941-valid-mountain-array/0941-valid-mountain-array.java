class Solution {
    public boolean validMountainArray(int[] arr) {
        int len=arr.length;
        if (len<3) return false;
    
        int pivot=0;
        for (int i=1;i<=len-2;i++){
            if (arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                pivot=i;
            }
        }
        if (pivot==0) return false;
        for (int i=0;i<pivot;i++){
            if (arr[i]>=arr[i+1]) return false;
        }
        for (int j=pivot+1;j<len-1;j++){
            if (arr[j+1]>=arr[j]) return false;
            
        }
        return true;
        
    }
}