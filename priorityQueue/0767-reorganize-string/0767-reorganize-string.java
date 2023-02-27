class Pair{
    char c;
    int n;
    Pair(char _c,int _n){
        this.c=_c;
        this.n=_n;
    }
}
class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int len=s.length();
        for (int i=0;i<len;i++){
            char cur=s.charAt(i);
            if (map.containsKey(cur)) map.put(cur,map.get(cur)+1);
            else map.put(cur,1);            
        }

        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
         for (Map.Entry<Character,Integer> entry: map.entrySet()) {
          pq.add(entry.getKey());
            
        }
        Queue<Integer> q=new LinkedList<>();   
        StringBuilder sb=new StringBuilder();
          
        
        while (pq.size()>1){
            char first=pq.poll();
            char sec=pq.poll();
            sb.append(first);
            sb.append(sec);
     
            map.put(first,map.get(first)-1);
            map.put(sec,map.get(sec)-1);
            if (map.get(first)>0) pq.add(first);
            if (map.get(sec)>0) pq.add(sec);
            
            
        }
        while (!pq.isEmpty()){
            char top=pq.poll();
            if (map.get(top)>1) return "";
            sb.append(top);
        }
        
        return sb.toString();
        
    }

   
    

}
