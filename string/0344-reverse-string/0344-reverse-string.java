class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        while (r>l){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
        
        
    }
}