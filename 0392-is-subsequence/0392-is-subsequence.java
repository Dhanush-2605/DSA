class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        int len=s.length();
        int ind=0;
        if (len<1) return true;
        for (int i=0;i<t.length();i++){
            if (ind<len && s.charAt(ind)==t.charAt(i) ){
                ind++;
                count++;
                
            }
        }
        if (count==len) return true;
        else return false;
        
    }
}