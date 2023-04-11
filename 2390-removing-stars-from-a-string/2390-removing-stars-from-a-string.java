class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        int len=s.length();
        for (char ch:s.toCharArray()){
            if (!st.isEmpty() && ch=='*'){
                st.pop();
            }
            else{
            st.push(ch);
            }
        }
        String res="";
        while (!st.isEmpty()) res=st.pop()+res;        
        return res;
    }
}