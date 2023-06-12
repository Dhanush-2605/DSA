public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ctn=0;
        while (n!=0){
            ctn+=n&1;
            n=n>>>1;
            // if (cur==1) ctn++;
        }
        return ctn;
        
    }
}