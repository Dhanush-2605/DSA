class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> n1=new ArrayList<>();
        List<Integer> n2=new ArrayList<>();
        for (int n:nums1) n1.add(n);
        for (int k:nums2) n2.add(k);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> t1=new ArrayList<>();
        List<Integer> t2=new ArrayList<>();
        for (int val:n1){
            if (!n2.contains(val) && !t1.contains(val)) t1.add(val);
        }
        
      for (int val:n2){
            if (!n1.contains(val) && !t2.contains(val)) t2.add(val);
        }
        res.add(t1);
        res.add(t2);
        return res;
        
    }
}