class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for (int i=0;i<n1;i++){
            char cur=s.charAt(i);
            if (!s1.isEmpty() && cur=='#') s1.pop();
            else s1.push(cur);
        }
       for (int i=0;i<n2;i++){
            char cur=t.charAt(i);
            if (!s2.isEmpty() && cur=='#') s2.pop();
            else s2.push(cur);
        }
        String r1="";
        String r2="";
        while (!s1.isEmpty()){
            char cur=s1.pop();
            if (cur!='#') r1=cur+r1;
        }
        while (!s2.isEmpty()){
            char cur=s2.pop();
        if (cur!='#') r2=cur+r2;
        }
        return r1.equals(r2);
    }
}