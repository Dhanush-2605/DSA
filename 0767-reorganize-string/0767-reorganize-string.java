class Solution {
    public String reorganizeString(String s) {
		HashMap<Character,Integer> map=new HashMap<>();
		PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));    
		for (char ch:s.toCharArray()){
             map.put(ch,map.getOrDefault(ch,0)+1);	
             
		}
       for (Map.Entry<Character,Integer> entry: map.entrySet()) {
          pq.add(entry.getKey());            
        }
       String res="";
        while (pq.size()>1){
            char first=pq.poll();
            char sec=pq.poll();
            res+=first;
            res+=sec;
            
            map.put(first,map.get(first)-1);
            map.put(sec,map.get(sec)-1);
            if (map.get(first)>0){
                pq.add(first);
            }
            if (map.get(sec)>0){
                pq.add(sec);
            }
        }
       
        if (!pq.isEmpty()){
            char ch=pq.poll();
            res+=ch;
            if (map.get(ch)>1) return "";
           
        }

        return res;
        
        
        
    }
}