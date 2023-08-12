class Solution {
    public int addDigits(int num) {
        int n=num;
        int ctn=0;
        while ((int)(Math.log10(n) + 1)>1){
            ctn++;
            int sum=0;
            while (n!=0){
                sum+=(n%10);
                n=n/10;
            }

            n=sum;
        }
        return n;
    }
}