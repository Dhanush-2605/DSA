class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        List<String> res=new ArrayList<>();
        for (int i=0;i<words.length;i++){
            if (map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }
            else{
                map.put(words[i],1);
            }
        }
    
    PriorityQueue<String> maxHeap = new PriorityQueue<>(new Comparator<String>(){
        public int compare(String s1,String s2){
            int f1=map.get(s1);
            int f2=map.get(s2);
            if (f1==f2) return s2.compareTo(s1);
             return f1-f2;
        }
    });
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
               maxHeap.add(entry.getKey());
               if (maxHeap.size()>k) maxHeap.poll();

    }
    for (int i=0;i<k;i++){
        res.add(maxHeap.poll());
    }

    Collections.reverse(res);
        System.out.println(map);
        return res;
        
    }
}