class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        int l=s.length();
        int st=0;
        int e=k;        
        for (int i=0;i<l-k+1;i++){
            String sub=s.substring(st,st+k);
            if (map.size()==Math.pow(2,k)) return true;
            if (!map.containsKey(sub)) map.put(sub,1);            
            st++;
            
       
        }
        if (map.size()==Math.pow(2,k)) return true;

        return false;
        
    }
}