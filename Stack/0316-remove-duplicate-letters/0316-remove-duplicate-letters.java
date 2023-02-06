class Solution {
    public String removeDuplicateLetters(String s) {
        int[] arr=new int[26];
        boolean[] visited=new boolean[26];
        Stack<Character> st=new Stack<>();
        int len=s.length();
        for (int i=0;i<len;i++){
            int ind=s.charAt(i)-'a';
            arr[ind]+=1;
        }
        for (int i=0;i<len;++i){
            if (visited[s.charAt(i)-'a']){
                arr[s.charAt(i)-'a']--;
                continue;
            }
            while (!st.isEmpty() && st.peek()>s.charAt(i) && arr[st.peek()-'a']>0){
                visited[st.peek()-'a']=false;
                st.pop();
            }
            st.push(s.charAt(i));
            visited[s.charAt(i)-'a']=true;
            arr[s.charAt(i)-'a']--;
        
        }
            
        String res="";
        while (!st.isEmpty()){
            res+=st.pop();
        }
        StringBuilder str=new StringBuilder();
        str.append(res);
        str.reverse();
    
     return str.toString();   
    }
}