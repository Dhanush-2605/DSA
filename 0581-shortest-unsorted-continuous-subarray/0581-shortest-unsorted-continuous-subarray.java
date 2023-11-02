class Solution {
    public int findUnsortedSubarray(int[] arr) {
         int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        if (arr.length==1) return 0;
        for (int i=0;i<n;i++){
            if (i==0){
                if (arr[i]>arr[i+1]){

                min=Math.min(min,arr[i]);
                max=Math.max(max,arr[i]);
                }
            }
           else if (i==n-1){
                if (arr[i]<arr[i-1]){

                min=Math.min(min,arr[i]);
                max=Math.max(max,arr[i]);
                }
            }
            else{
                 if (arr[i]<arr[i-1] || arr[i]>arr[i+1]){
                  min=Math.min(min,arr[i]);
                   max=Math.max(max,arr[i]);
            }
            }
            
        }
        if (min==Integer.MAX_VALUE && max==Integer.MIN_VALUE) return 0;
        int s=0;
        int r=0;
        for (int i=0;i<n;i++){
            if (min!=Integer.MAX_VALUE){
                if (arr[i]>min){
                    s=i;
                    break;
                }
                    
            }
        }
       for (int i=n-1;i>=0;i--){
            if (max!=Integer.MIN_VALUE){
                if (arr[i]<max){
                    r=i;
                    break;
                }
            }
        }
        // System.out.println(min+" "+max);
  
        return r-s+1;       
    }
}