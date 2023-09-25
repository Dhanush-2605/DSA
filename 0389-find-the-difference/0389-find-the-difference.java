class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap();
   
        int len=s.length();
        for (int i=0;i<len;i++){
            if (map.containsKey(s.charAt(i))){
                
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        int tlen=t.length();
        for (int i=0;i<tlen;i++){
            if (map.containsKey(t.charAt(i)) && map.get(t.charAt(i))>0){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
                
            }else{
                return t.charAt(i);

                
                
            }
        }
        return ' ';
    }
}