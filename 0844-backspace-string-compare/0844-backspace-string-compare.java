class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1=getStr(s);
        String s2=getStr(t);
        if (s1.equals(s2)) return true;
        return false;
    }
    String getStr(String s){
        Stack<Character> st=new Stack<>();
        for (char ch:s.toCharArray()){
            if (!st.isEmpty() && ch=='#'){
                st.pop();
                continue;
            }
            if (ch!='#') st.push(ch);
        }
        String res="";
        while (!st.isEmpty()){
            res=st.pop()+res;
            
        }
        return res;
    }
}