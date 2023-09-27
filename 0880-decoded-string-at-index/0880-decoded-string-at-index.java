class Solution {
    public String decodeAtIndex(String s, int k) {
        int n=s.length();
        long len=0;
            
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);            
            if (Character.isDigit(ch)){
                len=len*Character.getNumericValue(ch);
            }
            else len++;
            
        }


        for (int i=n-1;i>=0;i--){
                   char ch=s.charAt(i);  
            k%=len;
        if (k==0 && Character.isDigit(ch)==false ) return String.valueOf(ch);

               
            if (Character.isDigit(ch)){
                len=len/Character.getNumericValue(ch);
            }
            else len--;

        }







        return "";
    }
}