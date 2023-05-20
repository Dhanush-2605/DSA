class Solution {
    public int minSetSize(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int val:arr){
            if (map.containsKey(val)) map.put(val,map.get(val)+1);
            else map.put(val,1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.add(entry.getValue());            
        }
        int len=arr.length;
        int half=len/2;
        int c=0;
        while (len>half){
            c++;
            len=len-pq.poll();
        }
        return c;
        
    }
}