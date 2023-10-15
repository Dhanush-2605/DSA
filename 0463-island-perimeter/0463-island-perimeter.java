class Solution {
    public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] visited=new boolean[r][c];
        int res=0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (grid[i][j]==1){
                    res+=bfs(i,j,grid);
                }
            }
        }
        return res;
        
        
    }
    int bfs(int r,int c,int[][] grid){
        int[] delX={-1,0,1,0};
        int[] delY={0,1,0,-1};
        int temp=0;
        for (int i=0;i<4;i++){
            int nR=r+delX[i];
            int nC=c+delY[i];
            if (nR>=0 && nC>=0 && nR<grid.length && nC<grid[0].length && grid[nR][nC]==1){
                temp+=1;
            }
        }
        return 4-temp;
    }
}