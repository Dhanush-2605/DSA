class Solution {
    public boolean rotateString(String s, String goal) {
        String curStr=s+s;
        return (s.length()==goal.length() && curStr.contains(goal));
        
    }
}