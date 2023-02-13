class Solution {
    public String removeKdigits(String num, int k) {
  
        Stack<Character> s=new Stack<>();
        int l=num.length();
        if(k==l) return "0";  
        int i=0;
        while (i<l) {
            
            while (!s.isEmpty() && k>0 && s.peek()>num.charAt(i)){
               s.pop();
                k--;
            }
            s.push(num.charAt(i));
            i++;

            
        }
        while(k>0){
            s.pop();
            k--;
        }
       StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }   
        sb.reverse();        
    
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}