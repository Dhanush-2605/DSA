class Solution {
    public int uniquePathsIII(int[][] grid) {
        int ctn=0;
        int r=0;
        int c=0;
        int m=grid.length;
        int n=grid[0].length;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (grid[i][j]==1){
                    r=i;
                    c=j;
                    ctn++;

                }
                if (grid[i][j]==0){
                    ctn++;
                }
            }
        }
        int res=backtrack(grid,r,c,ctn,m,n);
        return res;

        
    }
    int backtrack(int[][] grid,int r,int c,int ctn,int m,int n){
        if (r<0 || c<0 || r>=m || c>=n || grid[r][c]==-1 ) return 0;
        if (grid[r][c]==2){
            if (ctn==0) return 1;
            else return 0;
        }
        grid[r][c]=-1;
        ctn--;

    int path=backtrack(grid,r+1,c,ctn,m,n)+backtrack(grid,r-1,c,ctn,m,n)+backtrack(grid,r,c+1,ctn,m,n)+ backtrack(grid,r,c-1,ctn,m,n);
        grid[r][c]=0;
        ctn++;
      return path;



    }
}