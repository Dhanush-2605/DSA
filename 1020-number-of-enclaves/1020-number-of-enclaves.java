class Solution {
    public int numEnclaves(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] visited=new boolean[r][c];
        for (int i=0;i<c;i++){
            if (visited[0][i]==false && grid[0][i]==1) dfs(grid,visited,0,i);
        }
        for (int i=0;i<c;i++){
            if (visited[r-1][i]==false && grid[r-1][i]==1) dfs(grid,visited,r-1,i);
        }
        for (int i=0;i<r;i++){
            if (visited[i][0]==false && grid[i][0]==1) dfs(grid,visited,i,0);
        }
        for (int i=0;i<r;i++){
            if (visited[i][c-1]==false && grid[i][c-1]==1) dfs(grid,visited,i,c-1);
        }
        int res=0;
        
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (visited[i][j]==false && grid[i][j]==1) res++;
            }
        }
        
        return res;
        
    }
    void dfs(int[][] grid,boolean[][] visited,int r,int c){
        visited[r][c]=true;
        int[] delR={-1,0,1,0};
        int[] delC={0,1,0,-1};
        for (int i=0;i<4;i++){
            int nR=r+delR[i];
            int nC=c+delC[i];
            if (nR>=0 && nC>=0 && nR<grid.length && nC<grid[0].length && visited[nR][nC]==false && grid[nR][nC]==1) dfs(grid,visited,nR,nC);
        }
    }
}