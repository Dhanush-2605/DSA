class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] w1=new int[26];
        int[] w2=new int[26];
        for (char ch:word1.toCharArray()){
            w1[ch-'a']++;
        }
        for (char ch:word2.toCharArray()){
            w2[ch-'a']++;
        }
        for (char ch:word1.toCharArray()){
            if ((w1[ch-'a']==0 && w2[ch-'a']!=0) || (w1[ch-'a']!=0 && w2[ch-'a']==0) ) return false;
        }




        Arrays.sort(w1);
        Arrays.sort(w2);

        return Arrays.equals(w1,w2);
        
    }
}