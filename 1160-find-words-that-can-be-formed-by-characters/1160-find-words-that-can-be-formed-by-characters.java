class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch:chars.toCharArray()){
            if (map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        int res=0;
        for (String ch:words){
            int tempSize=ch.length();
            int ctn=0;
            HashMap<Character,Integer> curMap=new HashMap<>();
            for (char cur:ch.toCharArray()){
            if (curMap.containsKey(cur)) curMap.put(cur,curMap.get(cur)+1);
            else curMap.put(cur,1);
                
            }
           for (char cur:ch.toCharArray()){
            int s1=map.getOrDefault(cur,0);
            int s2=curMap.get(cur);            
            if (s1>=s2) ctn++;          
                
            } 
           
            if (ctn==tempSize) res+=tempSize;
            
        }
        return res;
    }
}