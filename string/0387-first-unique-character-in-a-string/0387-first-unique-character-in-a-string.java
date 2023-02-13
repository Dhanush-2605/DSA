class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=s.length();
        for (int i=0;i<l;i++){
            if (map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
        ArrayList<Character> arr=new ArrayList<>();
        for (Map.Entry<Character,Integer> entry : map.entrySet()) 
            if (entry.getValue()==1) arr.add(entry.getKey());
    
    for(int i=0;i<l;i++){
        if (arr.contains(s.charAt(i))) return i;
    }
    return -1;
    }
}