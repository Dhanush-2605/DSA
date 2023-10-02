class Solution {
    public boolean winnerOfGame(String colors) {
        int s=0;
        int e=0;
        int aC=0;
        int bC=0;
    
        int n=colors.length();
        while (e<n){
            if (colors.charAt(s)==colors.charAt(e)){
                e++;                
            }
            else{
                int c=e-s;
                if (colors.charAt(s)=='A' && c-2>0) aC+=c-2;
                else if (colors.charAt(s)=='B' && c-2>0) bC+=c-2;
                s=e;
                
            }
        }
        int diff=e-s;
        if (colors.charAt(s)=='A' && diff-2>0) aC+=diff-2;
        else if (colors.charAt(s)=='B' && diff-2>0) bC+=diff-2; 


        if (aC>bC) return true;
        return false;
        
    }
}