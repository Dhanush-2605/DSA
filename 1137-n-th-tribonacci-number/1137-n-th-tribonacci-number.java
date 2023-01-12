class Solution {
    public int tribonacci(int n) {
        if (n==0) return 0;
        if (n==1 || n==2) return 1;
        int a0=0;
        int a1=1;
        int a2=1;
        int rem=n-2;
        int res=0;
        for (int i=0;i<rem;i++){
            res=a0+a1+a2;
            int temp1=a2;
            int temp2=a1;
            a2=res;
            a1=temp1;
            a0=temp2;
            
        }
        return res;
        
    }
}