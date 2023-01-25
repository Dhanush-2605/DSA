class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        PriorityQueue<Character> queue=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));        
        int l=s.length();
       
        for (int i=0;i<l;i++){
            if (map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
       queue.addAll(map.keySet());
        String res="";
        while (!queue.isEmpty()){
        
            char curChar=queue.remove();
            for (int i=0;i<map.get(curChar);i++){
                res+=curChar;
            }
            
  
}  
    
        
        return res;
    }
}