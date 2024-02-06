class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            int n=strs.length;

        String[] sorted=new String[n];
        int ind=0;
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for (String s:strs){
            char[] temp=s.toCharArray();
            Arrays.sort(temp);
            String cur=new String(temp);
            sorted[ind++]=cur;

        }
        for (int i=0;i<n;i++){
            if (map.containsKey(sorted[i])){
                List<String> cur=map.get(sorted[i]);
                cur.add(strs[i]);
                map.put(sorted[i],cur);
            }
            else{
                List<String> cur=new ArrayList<>();
                cur.add(strs[i]);
                map.put(sorted[i],cur);
            }
        }
        for (Map.Entry<String,List<String>> entry:map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
        
    }
}