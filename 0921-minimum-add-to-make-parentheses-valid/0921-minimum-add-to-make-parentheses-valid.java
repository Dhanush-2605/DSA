class Solution {
    public int minAddToMakeValid(String s) {
        int i=0;
        Stack<Character> stack=new Stack<>();
        while (i<s.length()){
            
      
            if (s.charAt(i)==')'){

                if (!stack.isEmpty() && stack.peek()=='(' ) stack.pop();
                else stack.push(s.charAt(i));

            }
            else stack.push(s.charAt(i));
                        i++;
        }
        return stack.size();
    }
}