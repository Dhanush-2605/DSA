class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n1=name.length();
        int n2=typed.length();
        int m=0;
        int n=0;
        if (name.equals(typed)) return true;
        if (n1>n2) return false;
        int i=0;
        for (int j=0;j<n2;j++){
            if (i<n1 && name.charAt(i)==typed.charAt(j)) i++;
            else if (j==0 || typed.charAt(j-1)!=typed.charAt(j)) return false;
            
        }
               
        return i==n1;
        
    }
}