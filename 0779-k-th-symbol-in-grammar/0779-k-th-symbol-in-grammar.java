class Solution {
    public int kthGrammar(int n, int k) {
        int l=0;
        int r=(int)Math.pow(2,n-1);
        int cur=0;
        for (int i=0;i<n-1;i++){
            int mid=l+(r-l)/2;
            if (k<=mid) r=mid;
            else{
                l=mid+1;
                if (cur==1) cur=0;
                else cur=1;
            }
        }
        return cur;
    }
}