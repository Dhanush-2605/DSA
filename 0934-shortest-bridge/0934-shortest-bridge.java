class Pair{
    int r;
    int c;
    int d;
    Pair(int _r,int _c,int _d){
        this.r=_r;
        this.c=_c;
        this.d=_d;
        
    }
}
class Solution {
    public int shortestBridge(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] visited=new boolean[r][c];
        int ctn=0;
        Queue<Pair> q=new LinkedList<>();
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (grid[i][j]==1 && visited[i][j]==false && ctn==0){
                    DFS(i,j,q,visited,grid);
                    ctn++;
                }
            }
            
        }
        int ans=Integer.MAX_VALUE;       

        while (!q.isEmpty()){
            int nr=q.peek().r;
            int nc=q.peek().c;
            int d=q.peek().d;
            // ans=d;
            q.poll();
            int[] delR={-1,0,1,0};
            int[] delC={0,1,0,-1};
            for (int i=0;i<4;i++){
                int newR=nr+delR[i];
                int newC=nc+delC[i];
                if (newR>=0 && newC>=0 && newR<r && newC<c && visited[newR][newC]==false){
                    q.add(new Pair(newR,newC,d+1));
                    visited[newR][newC]=true;
                    if (grid[newR][newC]==1) ans=Math.min(ans,d+1);
                    
                }
            }
        }
        return ans-1;
        
    }
    void DFS(int r,int c,Queue<Pair> q,boolean[][] visited,int[][] grid){
            if (r>=grid.length || c>=grid[0].length || r<0 || c<0 || grid[r][c]!=1 || visited[r][c]){
                return;
                
            }
        visited[r][c]=true;              

        q.add(new Pair(r,c,0));
        int[] delRow={-1,0,1,0};
        int[] delCol={0,1,0,-1};
        for (int i=0;i<4;i++){
            int newR=r+delRow[i];
            int newC=c+delCol[i];
            DFS(newR,newC,q,visited,grid);
            
        }
    
    }
    
    
}