class Pair{
    int row;
    int col;
    int tm;
    Pair(int _row,int _col,int _tm){
        this.row=_row;
        this.col=_col;
        this.tm=_tm;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
            int[][] visited=new int[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    visited[i][j]=2;
                }
            }
        }
        int[] drow={-1,0,+1,0};
        int[] dcol={0,+1,0,-1};
        int tm=0;
        while (!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
            q.poll();
            tm=Math.max(tm,t);

            for (int i=0;i<4;i++){
                int nr=r+drow[i];
                int nc=c+dcol[i];
                if (nr>=0 && nc>=0 && nr<m && nc<n && grid[nr][nc]==1 && visited[nr][nc]!=2){
                    visited[nr][nc]=2;
                    q.add(new Pair(nr,nc,t+1));

                }
            }
        }
        System.out.println(Arrays.deepToString(visited));
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (grid[i][j]==1 && visited[i][j]!=2) return -1;
            }
        }
        return tm;
    }
}