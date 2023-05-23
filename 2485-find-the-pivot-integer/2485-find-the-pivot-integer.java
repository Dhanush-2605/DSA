class Solution {
    public int pivotInteger(int n) {
        int sum=0;
        int lsum=0;
        int rsum=0;
        for (int i=1;i<=n;i++) sum+=i;
        for (int i=1;i<=n;i++){
            lsum+=i;
            rsum=sum-lsum;
            if (lsum==rsum+i) return i;
        }
        return -1;
    }
}