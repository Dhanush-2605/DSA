class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        
        int n=arr.length;        
        int res=arr[0];
        Arrays.sort(arr);
         arr[0]=1;
        for (int i=1;i<n;i++){
            int diff=Math.abs(arr[i]-arr[i-1]);
            if (diff>1){
                arr[i]=arr[i-1]+1;

            }
            res=Math.max(res,arr[i]);

        }

        return arr[n-1];
    }
}