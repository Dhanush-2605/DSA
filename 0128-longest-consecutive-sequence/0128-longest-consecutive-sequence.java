class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int val:nums){
            set.add(val);
        }
   
        int res=0;
        int ctn=0;
        for (int val:set){
            int prev=val-1;
            int next=val+1;
            if (!set.contains(prev)){
                int n=val;
                while (set.contains(n)){
                    ctn++;
                    n+=1;                 
                }                
            }         
            res=Math.max(res,ctn);
            ctn=0;
        }
        return res;
        
    }
}