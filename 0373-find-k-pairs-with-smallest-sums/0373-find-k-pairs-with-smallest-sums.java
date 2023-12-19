class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res=new ArrayList<>();
        PriorityQueue<List<Integer>> pq= new PriorityQueue<>((a,b)->(a.get(0)+a.get(1))-(b.get(0)+b.get(1)));
        int n=nums1.length;
        int m=nums2.length;
        for (int i=0;i<n;i++){
            List<Integer> cur=new ArrayList<>();
            cur.add(nums1[i]);
            cur.add(nums2[0]);
            cur.add(0);
            pq.add(cur);
        }

        while (k>0 && !pq.isEmpty()){
            List<Integer> top=pq.poll();
            k--;
            List<Integer> temp1=new ArrayList<>();
            List<Integer> cur=new ArrayList<>();
              cur.add(top.get(0));
            cur.add(top.get(1));
                        res.add(cur);
            if (top.get(2)==nums2.length-1) continue;
       temp1.add(top.get(0));
            temp1.add(nums2[top.get(2)+1]);
            temp1.add(top.get(2)+1);
                        pq.add(temp1);
        

       
        }


   
        return res;
        
    }
}