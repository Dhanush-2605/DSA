class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=s.length();
        for (int i=0;i<l;i++){
            if (map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
        String res="";
        while (!map.isEmpty()){
            int max=Integer.MIN_VALUE;
            char curChar=' ';
for (Map.Entry<Character,Integer> entry : map.entrySet()){  
    if (entry.getValue()>max){
        max=entry.getValue();
        curChar=entry.getKey();
    }
  
}  
            for (int i=0;i<max;i++) res+=curChar;
            map.remove(curChar);
        }
        return res;
    }
}