class Solution {
    public int getMaximumGold(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] visited=new boolean[r][c];
        int res=0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (grid[i][j]!=0 && visited[i][j]==false){
                    int cur=backtrack(i,j,grid,visited);
                    res=Math.max(res,cur);
                }
            }
        }
        return res;
        
    }
    
    int backtrack(int r,int c,int[][] grid,boolean[][] visited){
        if (r<0 || c<0 || r>=grid.length || c>=grid[0].length ||grid[r][c]==0 || visited[r][c]) return 0;
        
        visited[r][c]=true;
        int[] delR={-1,0,1,0};
        int[] delC={0,1,0,-1};
        int val=grid[r][c];
        int max=Integer.MIN_VALUE;
        for (int i=0;i<4;i++){
            int nR=r+delR[i];
            int nC=c+delC[i];
            int cur=val+backtrack(nR,nC,grid,visited);
            max=Math.max(max,cur);
            
            
        }
        visited[r][c]=false;
        return max;
    }
}