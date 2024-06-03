class Solution {
    public int appendCharacters(String s, String t) {
        int sInd=0;
        int tInd=0;
        int m=s.length();
        int n=t.length();
        while (sInd<m && tInd<n){
            if (s.charAt(sInd)==t.charAt(tInd)){
                // sInd++;
                tInd++;
            }
            sInd++;
        }
        return n-tInd;
    }
}