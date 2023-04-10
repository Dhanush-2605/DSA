class Solution {
    public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] visited=new boolean[r][c];
        int ans=0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (visited[i][j]==false && grid[i][j]==1)  ans=DFS(grid,i,j,visited);

            }
        }
        return ans;
        
    }
    int DFS(int[][] grid,int r,int c,boolean[][] visited){
        if (r<0 || c<0 ||r>=grid.length || c>=grid[0].length) return 1;
        if (grid[r][c]==0) return 1;
        if (visited[r][c]==true) return 0;
        visited[r][c]=true;
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        int count=0;
        for (int i=0;i<4;i++){
            int newRow=r+delRow[i];
            int newCol=c+delCol[i];
            count=count+DFS(grid,newRow,newCol,visited);
           
        }
        return count;
    }
}