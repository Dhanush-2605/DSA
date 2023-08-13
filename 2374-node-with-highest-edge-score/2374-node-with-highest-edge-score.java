class Solution {
    public int edgeScore(int[] edges) {
        int n=edges.length;
        HashMap<Integer,Long> map=new HashMap<>();
        for (int i=0;i<n;i++){
            if (map.containsKey(edges[i])) map.put(edges[i],(long)map.get(edges[i])+i);
            else map.put(edges[i],(long)i);
        }
        int res=0;
        long count=0;
        for (Map.Entry<Integer,Long> entry:map.entrySet()){
            int key=entry.getKey();
            long val=entry.getValue();
            if (val>count){
                count=val;
                res=key;
            }
            if (val==count){
                if (key<res) res=key;                
            }
        }        
        return res;  
        
        
    }
}