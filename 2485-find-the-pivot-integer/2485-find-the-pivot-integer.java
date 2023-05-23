class Solution {
    public int pivotInteger(int n) {
        int l=1;
        int r=n;
        while (r>=l){
            int mid=l+(r-l)/2;
            int lSum=0;
            int rSum=0;
            for (int i=1;i<=mid;i++) lSum+=i;
            for (int j=mid;j<=n;j++) rSum+=j;
            if (lSum==rSum) return mid;
            if (rSum>lSum)l=mid+1;
            else r=mid-1;
            
        }
        return -1;
    }
}