class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for (int val:nums){
          
            pq.add(val);
        }
        while (!pq.isEmpty()){
            int top=pq.poll();
            for (int i=1;i<k;i++){
                if (!pq.remove(top+i)) return false;
             
        }
        }
       return true; 
    }
}