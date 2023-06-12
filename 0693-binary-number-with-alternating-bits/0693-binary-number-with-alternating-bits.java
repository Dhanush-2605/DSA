class Solution {
    public boolean hasAlternatingBits(int n) {
        String bin=getBinary(n);
        int s=0;
        int e=bin.length()-1;
        for (int i=1;i<bin.length();i++){
            if (bin.charAt(i)==bin.charAt(i-1)) return false;
        }
        return true;
    }
    String getBinary(int n){
        String res="";
        while (n!=0){
            int rem=n%2;
            res=String.valueOf(rem)+res;
            n=n/2;
        }
        return res;
    }
}