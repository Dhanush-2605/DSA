class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        for (char ch:num.toCharArray()){
            int val=Character.getNumericValue(ch);
            while (!st.isEmpty() && st.peek()>val && k>0){
                st.pop();
                k--;
            }
            st.push(val);
        }
        while (k>0){
            st.pop();
            k--;
        }
        String res="";
        while (!st.isEmpty()){
            res=String.valueOf(st.pop())+res;
            
        }
  
        int ind=0;
        for (int i=0;i<res.length();i++){
            if (res.charAt(i)=='0') ind++;
            else break;
        }

        if (res.substring(ind,res.length()).length()==0) return "0";
        return  res.substring(ind,res.length());
        
    }
}