class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        if (s.length()!=t.length()) return false;
        for (char ch:s.toCharArray()){
            if (map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        int ctn=0;
        for (char ch:t.toCharArray()){
            if (map.getOrDefault(ch,0)!=0){
                map.put(ch,map.get(ch)-1);
                if (map.get(ch)==0) map.remove(ch);
                ctn++;
            }
        }
        if (ctn==s.length()) return true;
        return false;
    }
}