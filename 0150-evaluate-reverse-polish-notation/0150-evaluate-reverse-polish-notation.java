class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st=new Stack<>();
        for (String ch:tokens){
            if (ch.equals("+") || ch.equals("-")|| ch.equals("*") || ch.equals("/")){
                if (st.size()>=2){
                    int n1=Integer.valueOf(st.pop());
                    int n2=Integer.valueOf(st.pop());
                    if (ch.equals("+")) st.push(String.valueOf(n1+n2));
                    if (ch.equals("-")) st.push(String.valueOf(n2-n1));
                    if ( ch.equals("*")) st.push(String.valueOf(n1*n2));
                    if (ch.equals("/")) st.push(String.valueOf(n2/n1));
                   continue;
                }
            }
             st.push(String.valueOf(ch));
        }
        return Integer.valueOf(st.pop());
    }
}