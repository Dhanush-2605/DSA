class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        int len=s.length();
        for (int i=0;i<len;i++){
            if (s.charAt(i)!='*') st.push(s.charAt(i));
            else st.pop();
        }
        String res="";
        while (!st.isEmpty()){
            res+=st.pop();
        }
        StringBuilder sb=new StringBuilder();
        sb.append(res);
        sb.reverse();
        return sb.toString();
        
    }
}