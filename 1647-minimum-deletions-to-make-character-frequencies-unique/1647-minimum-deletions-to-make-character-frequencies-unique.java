class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch:s.toCharArray()){
            if (map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
            
        }
        Comparator<Character> customComparator = (c1, c2) -> {
            int freq1 = map.get(c1);
            int freq2 = map.get(c2);
            if (freq1 != freq2) {
                return freq2 - freq1;
            } else {
                return c1 - c2; 
            }
        };

        List<Character> charList = new ArrayList<>(s.length());
        for (char c : map.keySet()){
            charList.add(c);
        }
        Collections.sort(charList, customComparator);
        int n=charList.size();
      
        ArrayList<Integer> temp=new ArrayList<>();
        temp.add(map.get(charList.get(0)));
        int ctn=0;
        for (int i=1;i<n;i++){
            int c=map.get(charList.get(i));
            char ch=charList.get(i);
            while (temp.contains(c)){
                c--;
                ctn++;
                
            }
            if (c!=0) temp.add(c);
        }
        

        return ctn;
        
    }
}