class Solution {
    public boolean isSubsequence(String s, String t) {
        int sL=s.length();
        int tL=t.length();
        return recurse(s,t,sL-1,tL-1);
        
    }
    boolean recurse(String s,String t,int i,int j){
        
         if (i<0) return true;
        if (j<0) return false;
        
        boolean notTake=false;
        boolean take=false;
        if (s.charAt(i)==t.charAt(j)) take=recurse(s,t,i-1,j-1);
        else notTake=recurse(s,t,i,j-1);
        return (take || notTake);
    }
}