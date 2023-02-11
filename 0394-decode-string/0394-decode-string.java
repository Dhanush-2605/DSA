class Solution {
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();
        int l=s.length();
        ArrayList<String> arr=new ArrayList<>();
        for (int i=0;i<10;i++){
            arr.add(String.valueOf(i));
        }
        for (int i=0;i<l;i++){
            if (s.charAt(i)!=']') st.push(Character.toString(s.charAt(i)));
            else{
                String cur="";
                while (!st.peek().equals("[")){
                    cur=st.pop()+cur;
                }

                st.pop();
                String k="";
                while (!st.isEmpty() && arr.contains(st.peek())){
                    k=st.pop()+k;
                }
                int num=1;
                if (k.length()>=1) num=Integer.parseInt(k);
                st.push(cur.repeat(num));
                
            }
}
        String ans="";
        while (!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
        
    }
}