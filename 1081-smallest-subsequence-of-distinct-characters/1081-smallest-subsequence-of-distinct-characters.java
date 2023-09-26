class Solution {
    public String smallestSubsequence(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch:s.toCharArray()){
            if (map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        HashMap<Character,Boolean> visited=new HashMap<>();
        Stack<Character> st=new Stack<>();
       for (int i=0;i<s.length();i++) {
         char ch=s.charAt(i);
           if (visited.getOrDefault(ch,false)==true){
               // map.put(ch,);
               map.put(ch,map.get(ch)-1);
               continue;
           }
           
         while (!st.isEmpty() && st.peek()>ch && map.get(st.peek())>0){
             visited.put(st.peek(),false);
             st.pop();
         }
          st.push(ch);
           map.put(ch,map.get(ch)-1);
           visited.put(ch,true);
     }
        String ans="";
        while (!st.isEmpty()) ans=st.pop()+ans;
        return ans;
    }
}