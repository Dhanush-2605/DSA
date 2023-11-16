class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashMap<String,Integer> map=new HashMap<>();
        for (String s:nums) map.put(s,1);
        int n=nums.length;
        int tot=(int)Math.pow(2,n);
        for (int i=0;i<tot;i++){
            String cur=Integer.toBinaryString(i);
            while (cur.length()<n){
                cur="0"+cur;
            }
            if (map.getOrDefault(cur,0)==0) return cur;
        }
        return "";
        
        
        
    }
}