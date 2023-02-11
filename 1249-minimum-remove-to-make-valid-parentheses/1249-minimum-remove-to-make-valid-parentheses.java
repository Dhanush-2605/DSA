class Solution {
    public String minRemoveToMakeValid(String s) {
    Stack<Integer> st=new Stack<>();
        int l=s.length();
        for (int i=0;i<l;i++){
            char ch=s.charAt(i);
            if (ch=='(') st.push(i);
            if (ch==')'){
                if (!st.isEmpty() && s.charAt(st.peek())=='(') st.pop();
                else{                   
                    st.push(i);                    
                }
            }
        }
        char[] cha=s.toCharArray();
            String res="";

        while (!st.isEmpty()){
            cha[st.pop()]='*';
        }
        for (int i=0;i<cha.length;i++){
            if (cha[i]!='*') res+=cha[i];
        }
 
        
        return res;
        
    }
}