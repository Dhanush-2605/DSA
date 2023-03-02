class Solution {
    public String removeOccurrences(String s, String part) {
    StringBuilder sb=new StringBuilder(s);
    int len=part.length();
    while (sb.indexOf(part)!=-1){
        int ind=sb.indexOf(part);
        sb.delete(ind,ind+len);
    }
        return sb.toString();
    }
    
}