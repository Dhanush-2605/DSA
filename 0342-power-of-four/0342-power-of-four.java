class Solution {
    public boolean isPowerOfFour(int n) {
        if (n<=0) return false;
        double x=Math.log(n)/Math.log(4);
        // System.out.println(x);
        int val=(int)Math.floor(x);
        if (Math.pow(4,val)==n) return true;
        return false;

  
        
    }
}