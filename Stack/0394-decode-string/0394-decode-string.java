class Solution {
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();
        int i=s.length()-1;
        while (i>=0){
            String cur=String.valueOf(s.charAt(i));
            if (!cur.equals("[")) st.push(cur);
            else{
                String newStr="";
                while (!st.isEmpty() && !st.peek().equals("]")){
                    newStr=newStr+st.pop();
                }
                st.pop();
                i--;
                int num=0;
                int p=0;
                while (i>=0 && Character.isDigit(s.charAt(i))){
                int digit=Character.getNumericValue(s.charAt(i));
                num+=(int)digit*Math.pow(10,p);
                p++;
                i--;
                }
                newStr=newStr.repeat(num);
                st.push(newStr);
                i++;
            }
            i--;
        }
        String res="";
        while (!st.isEmpty()){
            res+=st.pop();
        }
        return res;
        
    }
}