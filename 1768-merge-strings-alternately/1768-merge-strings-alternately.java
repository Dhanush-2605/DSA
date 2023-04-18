class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        int l1=word1.length();
        int l2=word2.length();
        int i=0;
        int j=0;
        while (i<l1 && j<l2){
            res+=String.valueOf(word1.charAt(i))+String.valueOf(word2.charAt(j));
            i++;
            j++;
        }
        while (i<l1){
            res+=String.valueOf(word1.charAt(i));
            i++;
        }
        while (j<l2){
            res+=String.valueOf(word2.charAt(j));
            j++;
        }
        return res;
    }
}