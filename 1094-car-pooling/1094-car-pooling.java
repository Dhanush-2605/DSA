class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        if (trips == null || trips.length == 0) {
            return true;
        }
        Arrays.sort(trips, new Comparator<int[]>(){
             public int compare (int[] a, int[] b) {
                 return a[1] - b[1];
             }
        });
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare (int[] a, int[] b) {
                return a[2] - b[2];
            }
        });
        
        
        for (int i=0;i<trips.length;i++){
            int num=trips[i][0];
            int start=trips[i][1];
            while (!pq.isEmpty() && start>=pq.peek()[2]){
                capacity+=pq.poll()[0];
            }
            
            if (capacity>=num){
                pq.offer(trips[i]);
                capacity-=num;
            }
            else return false;
            
        }
        return true;
        
        
        
    
    }
}