class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
     if (s.length()%2!=0) return false;
        for (char ch:s.toCharArray()){
         
            if (!st.isEmpty() && ch==')' && st.peek()=='(') st.pop();
            else if (!st.isEmpty() && ch==']' && st.peek()=='[') st.pop();
            else if (!st.isEmpty() && ch=='}' && st.peek()=='{') st.pop();
            else st.push(ch);
                
            
        }
        if (st.size()>=1) return false;
        return true;
    }
}