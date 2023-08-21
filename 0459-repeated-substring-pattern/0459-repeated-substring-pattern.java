class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for (int i=0;i<(n/2);i++){
            String sub=s.substring(0,i+1);
            int tempN=n/sub.length();
            String cur="";
            
            for (int j=0;j<tempN;j++){
               cur+=sub;
            }
            if (s.equals(cur)) return true;
                 
            
            
        }
        return false;
            
        
   
        
    }

};