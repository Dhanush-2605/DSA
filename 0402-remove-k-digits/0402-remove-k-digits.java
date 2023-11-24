class Solution {
    public String removeKdigits(String S, int K) {
         Stack<Integer> st=new Stack<>();
        int i=0;
        int n=S.length();
        if (n==K) return "0";
        while (i<n){
            int cur=Character.getNumericValue(S.charAt(i));
            while (!st.isEmpty() && st.peek()>cur && K>0){
                K--;
                st.pop();
                
            }
            st.push(cur);
            i++;
        }
        while (K>0){
            st.pop();
            K--;
        }
        // System.out.println(st);
        String res="";
        while (!st.isEmpty()){
            res=String.valueOf(st.pop())+res;
        }
        int j=0;
        while (j<res.length() && res.charAt(j)=='0') j++;
        String ans=res.substring(j,res.length());
          

        
        return ans==""?"0":ans;
    }
}