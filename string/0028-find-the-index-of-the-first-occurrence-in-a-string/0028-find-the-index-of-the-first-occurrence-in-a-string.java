class Solution {
    public int strStr(String haystack, String needle) {
        long preCompute=1;
        int n1=haystack.length();
        int n2=needle.length();
        if (n2>n1) return -1;
        long d=31;
        long q=1000000000000000003L;
        for (int i=0;i<n2-1;i++){
            preCompute=(preCompute*d)%q;
        }
        long hSource=0;
        long hTarget=0;
        for (int i=0;i<n2;i++){
            hSource=(hSource*d+haystack.charAt(i))%q;
            hTarget=(hTarget*d+needle.charAt(i))%q;
        }
        if (hSource==hTarget) return 0;
        for (int i=1;i<n1-n2+1;i++){
            hSource=(hSource-haystack.charAt(i-1)*preCompute+q)%q;
            hSource=(hSource*d+haystack.charAt(i+n2-1))%q;
            if (hSource==hTarget){
             
                if (haystack.substring(i,i+n2).equals(needle)) return i;
            }
        }
        return -1;
    }
}