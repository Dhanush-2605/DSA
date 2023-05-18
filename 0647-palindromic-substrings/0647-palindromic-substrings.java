class Solution {
    public int countSubstrings(String s) {
        int l=0;
        int r=0;
        int len=s.length();
        int ctn=0;
        int ind=0;
        while (ind<len){
            if (l<0 || r>=len || s.charAt(l)!=s.charAt(r)){
                ind++;
                l=ind;
                r=ind;
            }
             else if (s.charAt(l)==s.charAt(r)){
                ctn++;
                l--;
                r++;
            }
            
        }
        
        l=0;
        r=l+1;
        ind=0;
        while(ind<len){
            if (l<0 || r>=len || s.charAt(l)!=s.charAt(r)){
                ind++;
                l=ind;
                r=l+1;
            }
            else if (s.charAt(l)==s.charAt(r)){
                ctn++;
                l--;
                r++;
            }
          
        }
        return ctn;
        
    }
}