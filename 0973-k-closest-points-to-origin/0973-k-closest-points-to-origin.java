class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int r=points.length;
        int c=points[0].length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]*b[0]+b[1]*b[1]-a[0]*a[0]-a[1]*a[1]);
        HashMap<Double,Integer> map=new HashMap<>();
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       for (int[] arr:points){
              pq.offer(arr);
           if(pq.size()>k){
               pq.poll();
           }
        
       }

        int[][] res=new int[k][2];

        while (k>0){
            res[--k]=pq.poll();
        }
 
        return res;

        
        
    }
}