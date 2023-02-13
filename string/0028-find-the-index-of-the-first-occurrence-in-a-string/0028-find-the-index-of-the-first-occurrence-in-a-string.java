class Solution {
    public int strStr(String haystack, String needle) {
        int n1=haystack.length();
        int n2=needle.length();
        int i=0;
        int ind=0;
        while (i<n1){
            if (haystack.charAt(i)==needle.charAt(ind)){               
                String sub="";
                if (n1>=i+n2) sub=haystack.substring(i,i+n2);
                if (sub.equals(needle)) return i;              

         }  
        i++;
     
        }
        return -1;
    }
}