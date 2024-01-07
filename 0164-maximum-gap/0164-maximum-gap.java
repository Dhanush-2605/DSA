class Solution {
    
    public int maximumGap(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int res=Integer.MIN_VALUE;
        if (nums.length<2) return 0;
        for (int val:nums) pq.add(val);
        while (pq.size()>=2){
            int s1=pq.poll();
            int s2=pq.peek();
            res=Math.max(res,s2-s1);            
            
        }
       
        return res;
        
        
    }
}