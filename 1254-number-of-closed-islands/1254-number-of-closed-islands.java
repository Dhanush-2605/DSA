class Solution {
    public int closedIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] visited=new boolean[r][c];
        int ctn=0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){               
                            
                    if (grid[i][j]==0 && visited[i][j]==false){
                        if (dfs(i,j,visited,grid)==true) ctn++;
                    }
                
            }
        }
        return ctn;
        
    }
    boolean dfs(int r,int c,boolean[][] visited,int[][] grid){
        if (r<0 || c<0 || r>=grid.length || c>=grid[0].length) return false;
        if (visited[r][c]) return true;
        if (grid[r][c]==1) return true;
        visited[r][c]=true;
        boolean ans=true;
        
           // boolean isClosed= true;
        // ans&= dfs(r-1 ,c ,visited,grid);
        // ans&= dfs(r+1 ,c , visited,grid);
        // ans&= dfs(r ,c-1 , visited,grid);
        // ans&= dfs(r ,c+1 ,visited,grid);
        
        int[] delR={-1,0,1,0};
        int[] delC={0,1,0,-1};
        for (int i=0;i<4;i++){
            int nR=r+delR[i];
            int nC=c+delC[i];    
                ans&= dfs(nR,nC,visited,grid);
       
        }
        return ans;
        
    }
}