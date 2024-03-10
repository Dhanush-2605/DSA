class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int val:nums1){
            if (map.containsKey(val)) map.put(val,map.get(val)+1);
            else map.put(val,1);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for (int val:nums2){
            int ctn=map.getOrDefault(val,0);
            if (ctn>0){
                res.add(val);
                map.put(val,0);
            }
        }
        int[] ans=new int[res.size()];
        for (int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        
        return ans;
        
        
    }
}