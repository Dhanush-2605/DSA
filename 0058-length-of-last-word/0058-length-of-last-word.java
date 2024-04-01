class Solution {
    public int lengthOfLastWord(String s) {      
       
        int n=s.length(); 
        int i=n-1;
        while (i>=0){
            int ch=s.charAt(i);
            if (ch==32) i--;
            else break;
        }
        int j=i;
        while (j>=0 && s.charAt(j)!=32){
            j--;
        }
        return i-j;
    }
}