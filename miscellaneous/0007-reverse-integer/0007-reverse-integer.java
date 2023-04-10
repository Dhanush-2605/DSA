class Solution {
    public int reverse(int x) {

    long ans=0;
    int n=x;
        
    int len = (int) (Math.log10(Math.abs(x)) + 1);
        int p=len-1;

        while (n!=0){
            int rem=n%10;
            if (rem!=0){
                ans+=rem*Math.pow(10,p);
            }
             p--;

            n=n/10;
        }
if (ans > Math.pow(2, 31)-1 || ans < -(Math.pow(2, 31))) {
return 0;
}
        return (int)ans;
    }
}