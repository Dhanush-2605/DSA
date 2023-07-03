class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();      
        int n=strs.length;
        String[] ascii=new String[n];

        for (int i=0;i<strs.length;i++){
            String s=strs[i];
        char[] charArray = s.toCharArray();

        Arrays.sort(charArray);

        String sortedString = new String(charArray);
    
            ascii[i]=sortedString;         
                       
        }
        for (int i=0;i<n;i++){
            if (map.containsKey(ascii[i])){
                List<String> curr=map.get(ascii[i]);
                curr.add(strs[i]);
                    map.put(ascii[i],curr);
                
            }
            else{
                List<String> cur=new ArrayList<>();
                cur.add(strs[i]);
                map.put(ascii[i],cur);
            }
        }       

        for (Map.Entry<String,List<String>> entry : map.entrySet()){
            res.add(entry.getValue());            

        }
        return res;

        
    }
}