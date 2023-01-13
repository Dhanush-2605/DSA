class Solution {
    public boolean rotateString(String s, String goal) {
        int len=s.length();
        for (int i=0;i<len;i++){
            char a=s.charAt(0);
            s=s+a;
            s = s.substring(1, s.length());          
            
            if (s.equals(goal)) return true;
            
        }
        return false;
        
    }
}