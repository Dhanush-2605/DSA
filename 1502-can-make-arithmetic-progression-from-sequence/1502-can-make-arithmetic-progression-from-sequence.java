class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d=Math.abs(Math.abs(arr[1])-Math.abs(arr[0]));
        if (arr[0]<0 && arr[1]>=0) d=arr[1]-arr[0];        
        int n=arr.length;
        for (int i=2;i<n;i++){
            int d2=Math.abs(Math.abs(arr[i])-Math.abs(arr[i-1]));
            if (arr[i]>=0 && arr[i-1]<0) d2=arr[i]-arr[i-1];            
           if (d2!=d) return false;
        }
     return true;    
    }
    
}