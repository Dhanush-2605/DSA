class Solution {
    public int longestPalindrome(String s) {
        int len=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch:s.toCharArray()){
        if (map.containsKey(ch)) map.put(ch,map.get(ch)+1);
        else map.put(ch,1);
    }
    int c=0;
    if (map.size()==1) return len;
    int odd=0;
for (Map.Entry<Character,Integer> entry : map.entrySet()) {
    if ((entry.getValue()%2)==0) c+=entry.getValue();
    else{
    odd++;
    c+=entry.getValue()-1;
    }
    
            
}
if (odd>=1) c++;
        return c;
        
    }
}