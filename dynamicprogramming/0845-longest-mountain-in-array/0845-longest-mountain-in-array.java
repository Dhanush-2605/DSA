class Solution {
    public int longestMountain(int[] arr) {
        int max=0;
        for (int i=1;i<=arr.length-2;){
            if (arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int peak=i;
                int lC=1;
                while (peak>0 && arr[peak]>arr[peak-1]){
                    lC++;
                    peak--;
        }
                while (i<arr.length-1 && arr[i]>arr[i+1]){
                    lC++;
                    i++;
        } 
                max=Math.max(max,lC);
    
            }
            else{
                i++;
            }
        }
        return max;
        
    }

}