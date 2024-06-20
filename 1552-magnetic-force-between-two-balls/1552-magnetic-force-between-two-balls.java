class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int s=0;
        int e=position[position.length-1];
        int ans=-1;
        while (e>=s){
            int mid=s+(e-s)/2;
            if (isValid(position,mid,m)){
                s=mid+1;
                ans=mid;
                
            }else e=mid-1;
        }
       return ans; 
    }
    boolean isValid(int[] arr,int gap,int m){
        int prev=arr[0];
        int b=1;
        for (int i=1;i<arr.length;i++){
            if(arr[i]-prev>=gap){
                b++;
                prev=arr[i];
            }
        }
        if (b>=m) return true;
        return false;
    }
}