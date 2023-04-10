class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        boolean[][]  visited=new boolean[row][col];
        int res=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (visited[i][j]==false && grid[i][j]==1){
                    res=Math.max(res,DFS(i,j,grid,visited));
                    
                }
            }
        }
                    return res;

    }
    int DFS(int r,int c,int[][] grid,boolean[][] visited){
      if (r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0) return 0;
        if (visited[r][c]==true) return 0;
        
           visited[r][c]=true;
           int[] delRow={-1,0,1,0};
            int[] delCol={0,1,0,-1};
            int ctn=1;
            for (int i=0;i<4;i++){
                int newR=r+delRow[i];
                int newC=c+delCol[i];
            
                 ctn+=DFS(newR,newC,grid,visited);
                
            }
            return ctn;
        }
}