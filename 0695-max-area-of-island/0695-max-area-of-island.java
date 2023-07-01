class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] visited=new boolean[r][c];
        int res=0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (visited[i][j]==false && grid[i][j]==1){
                    res=Math.max(res,DFS(grid,visited,i,j));
                }
            }
        }
        return res;
    }
    int DFS(int[][] grid,boolean[][] visited,int r,int c){
        if (r< 0 || c>=grid[0].length || r>=grid.length || c<0 || grid[r][c]==0 || visited[r][c]==true) return 0;
        
        visited[r][c]=true;
        int[] delR={-1,0,1,0};
        int[] delC={0,1,0,-1};
      int ctn=1;
        for (int i=0;i<4;i++){
            int nR=r+delR[i];
            int nC=c+delC[i];

               
         ctn+=DFS(grid,visited,nR,nC);
                
            
        }
        return ctn;
    }
}