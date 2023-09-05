class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length+1;
        int[] res=new int[n];
        res[0]=0;
        int ans=Integer.MIN_VALUE;
        for (int i=0;i<n-1;i++){
            res[i+1]=gain[i]+res[i];
            ans=Math.max(ans,res[i]);
        }
        ans=Math.max(ans,res[n-1]);
        return ans;
        
    }
}