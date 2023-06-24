class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int[] arr:matrix){
            for (int val:arr){
               pq.add(val);
        }
        }
        int ans=0;
        // System.out.println(pq);
        for (int i=0;i<k;i++){
            ans=pq.poll();            
        }
        return ans;
        
        
    }
}