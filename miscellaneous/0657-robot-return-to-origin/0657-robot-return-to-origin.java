class Solution {
    public boolean judgeCircle(String moves) {
        int r=0;
        int c=0;
        for (char ch:moves.toCharArray()){
            if (ch=='U') r-=1;
            else if (ch=='R') c+=1;
            else if (ch=='D') r+=1;
            else if (ch=='L') c-=1;
            
        }
        if (r==0 && c==0) return true;
        return false;
        
    }
}