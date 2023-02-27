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
    public int shortestPathBinaryMatrix(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] dist=new int[row][col];
        for (int[] arr:dist){
            Arrays.fill(arr,Integer.MAX_VALUE);
        }
        dist[0][0]=1;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.d-b.d);
        pq.add(new Pair(1,0,0));
        if (grid[0][0]==1) return -1;
        while (!pq.isEmpty()){
            int d=pq.peek().d;
            int r=pq.peek().r;
            int c=pq.peek().c;
            pq.remove();
            int[] delRow={-1,0,1,0,-1,-1,1,1};
            int[] delCol={0,1,0,-1,-1,1,1,-1};
            for (int i=0;i<8;i++){
                int newRow=r+delRow[i];
                int newCol=c+delCol[i];
                if (newRow>=0 && newCol>=0 && newRow<row && newCol<col && grid[newRow][newCol]==0){
                    if (d+1<dist[newRow][newCol]){
                        dist[newRow][newCol]=d+1;
                        pq.add(new Pair(d+1,newRow,newCol));
                    }
                }
            }
        }
        int res=dist[row-1][col-1];
        if (res==Integer.MAX_VALUE) return -1;
        return res;
    }
}