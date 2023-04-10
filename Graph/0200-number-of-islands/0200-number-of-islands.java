class Solution {
    public int numIslands(char[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        boolean[][]  visited=new boolean[row][col];
        int res=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (visited[i][j]==false && grid[i][j]=='1'){
                    DFS(i,j,grid,visited);
                    res++;
                }
            }
        }
                    return res;

    }
        void DFS(int r,int c,char[][] grid,boolean[][] visited){
           visited[r][c]=true;
           int[] delRow={-1,0,1,0};
            int[] delCol={0,1,0,-1};
            for (int i=0;i<4;i++){
                int newR=r+delRow[i];
                int newC=c+delCol[i];
                if (newR>=0 && newC>=0 && newR<grid.length && newC<grid[0].length && grid[newR][newC]=='1'){
                    if (visited[newR][newC]==false) DFS(newR,newC,grid,visited);
                }
            }
            return;
        }
    
}