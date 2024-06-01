class Solution {
    public String longestPalindrome(String st) {
        int n=st.length();
        boolean isEven=false;
        String res="";
        if (st.length()%2==0) isEven=true;
        for (int i=0;i<n;i++){
            int s=i;
            int e=i;
           
                while (s>=0 && e<n && st.charAt(s)==st.charAt(e)){
                    String sub=st.substring(s,e+1);
                    
                    if (sub.length()>res.length()) res=sub;
                    s--;
                    e++;
                }
                
       
       
                s=i;
                e=i+1;
                while (s>=0 && e<n && st.charAt(s)==st.charAt(e)){
                    String sub=st.substring(s,e+1);
                    
                    if (sub.length()>res.length()) res=sub;
                    s--;
                    e++;
                }
                
        
            
            
        }
        return res;
        
    }
}