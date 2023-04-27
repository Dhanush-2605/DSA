class Solution {
    public String longestPalindrome(String s) {
        int[][] palindromeDp = new int[s.length()][s.length()];
        char[] textArray = s.toCharArray();
        int startIndex = -1, endIndex = -1;
        
        for (int i = textArray.length - 1; i >= 0; i--) {
            for (int j = 0; j < textArray.length; j++) {
                if (i == j) {
                    palindromeDp[i][j] = 1;
                } else if(i > j) {
                    palindromeDp[i][j] = 0;
                } else if((textArray[i] == textArray[j]) && palindromeDp[i+1][j-1] >= 0) {
                    palindromeDp[i][j] = palindromeDp[i+1][j-1] + 2; 
                } else {
                    palindromeDp[i][j] = -1;    
                }
            }
        }
        
        for (int i = 0; i < palindromeDp.length; i++) {
            for (int j = 0; j < palindromeDp.length; j++) {
                if(i <= j && palindromeDp[i][j] >= (endIndex-startIndex+1)) {
                    startIndex = i;
                    endIndex = j;
                }
            }
        }
        return s.substring(startIndex, endIndex+1);
    }
}