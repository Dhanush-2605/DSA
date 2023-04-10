class Solution {
    public boolean checkString(String s) {
        int l=s.length();
        for (int i=0;i<l;i++){
            char cur=s.charAt(i);
            if (cur=='b' && i+1<l && s.charAt(i+1)=='a') return false;
        }
        return true;
        
    }
}