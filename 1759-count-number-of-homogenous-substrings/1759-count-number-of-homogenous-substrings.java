class Solution {
    public int countHomogenous(String s) {
        int l=0;
        int r=1;
        long res=0;
        int mod=(int)Math.pow(10,9)+7;
        while (r<s.length()){
            if (s.charAt(l)==s.charAt(r)){
               r++;
            }
            else{
                res=(res+getSum(r-l))%mod;
                l=r;
                r++;
            }
        }
        res=(res+getSum(r-l))%mod;
        return (int)res;
    }
    long getSum(long n){
     long sum=(n*(n+1))/2;
    return sum;
    }
}