class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st=new Stack<>();
        int n=num.length();
  
        for (int i=0;i<n;i++){
            int cur=Character.getNumericValue(num.charAt(i));
            if (!st.isEmpty()){
                          
                while (!st.isEmpty() && st.peek()>cur && k>0){

                     st.pop();
                     k--;
                }
            }
            st.push(cur);
        }
        while(k!=0){
            st.pop();
            k--;
        }
        if (st.size()==0) return "0";

        String res="";
        while (!st.isEmpty()){
            res=st.pop()+res;
        }
        int ind=0;
        for (int i=0;i<res.length();i++){
            if (res.charAt(i)!='0') break;
            else ind++;
        }
    
        res=res.substring(ind,res.length());
        if (res.length()==0) return "0";
        return res;
    }
}