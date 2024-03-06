class Solution {
    public int strStr(String pattern, String text) {
         ArrayList<Integer> arr=new ArrayList<>();
        int i=0;
        int n=pattern.length();
        int tL=text.length();
        if (tL>n) return -1;
        while (i+tL<=n){
            if (pattern.charAt(i)==text.charAt(0)){
                String sub=pattern.substring(i,i+tL);
                if (sub.equals(text)){
                   return i;
                }
               
            }
            i++;
          
        }
        return -1;       
    }
}