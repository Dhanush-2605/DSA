class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=s.length();
     for (int i=0;i<l;i++){
            if (map.containsKey(s.charAt(i))) return s.charAt(i);
            else map.put(s.charAt(i),1);
        }
        return 'a';
    }
}