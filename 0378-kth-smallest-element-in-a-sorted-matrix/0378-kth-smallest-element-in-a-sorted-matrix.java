class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->a-b);
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                q.add(matrix[i][j]);
            }
        }
        for (int i=0;i<k-1;i++) q.remove();
        return q.remove();
        
        
    }
}