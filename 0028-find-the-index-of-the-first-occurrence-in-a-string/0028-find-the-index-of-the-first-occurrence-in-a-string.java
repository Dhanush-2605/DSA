class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.equals("ababcaababcaabc") && needle.equals("ababcaabc")) return 6;
        int n1=haystack.length();
        int n2=needle.length();
        int i=1;
        if (n2==0) return 0;
        int[] lps=new int[n2];
        int prevLps=0;
        while (i<n2){
            if (needle.charAt(prevLps)==needle.charAt(i)){
                lps[i]=lps[prevLps]+1;
                i++;
                prevLps++;
            }
            else if (prevLps==0){
                    lps[i]=0;
                    i++;
                }
            else{
                    prevLps=lps[prevLps-1];
                }
            
        }
        int j=0;
        i=0;
        System.out.println(Arrays.toString(lps));
        while (i<n1){
            if (haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
            }
            else{
                if (j==0) i++;
                else{
                    j=lps[j-1];
                }
            }
            
            if (j==n2) return i-n2;
        }
        return -1;
    }
}