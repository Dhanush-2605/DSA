class Pair{
    int d;
    int r;
    int c;
    Pair(int _d,int _r,int _c){
        this.d=_d;
        this.r=_r;
        this.c=_c;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.d-b.d);
        pq.add(new Pair(0,0,0));
        // int row=
        int row=heights.length;
                int col=heights[0].length;

        int[][] distance=new int[row][col];
        for(int[] arr:distance) Arrays.fill(arr,Integer.MAX_VALUE);
        distance[0][0]=0;

        while (!pq.isEmpty()){
            int d=pq.peek().d;
            int r=pq.peek().r;
            int c=pq.peek().c;
            pq.remove();
            int[] delRow={-1,0,1,0};
            int[] delCol={0,1,0,-1};
            for (int i=0;i<4;i++){
                int newRow=r+delRow[i];
                int newCol=c+delCol[i];
                if (newRow>=0 && newCol>=0 && newRow<row && newCol<col){
                    int newEffort=Math.max(Math.abs(heights[r][c]-heights[newRow][newCol]),d);
                if (newEffort<distance[newRow][newCol]){
                    pq.add(new Pair(newEffort,newRow,newCol));
                    distance[newRow][newCol]=newEffort;

                }

            

    }
            }
        }
        int res=distance[row-1][col-1];
        
return res;
        
    }
}