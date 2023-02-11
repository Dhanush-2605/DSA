class Pair{
    int a;
    int b;
    public Pair(int _a,int _b){
        this.a=_a;
        this.b=_b;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] visited=new boolean[r][c];
        Queue<Pair> q=new LinkedList<Pair>();
        for (int i=0;i<c;i++){
            if (visited[0][i]==false && grid[0][i]==1){
                q.add(new Pair(0,i));
                visited[0][i]=true;
            }
        }
        for (int i=0;i<c;i++){
            if (visited[r-1][i]==false && grid[r-1][i]==1){
                q.add(new Pair(r-1,i));
                visited[r-1][i]=true;
            }
        }
        for (int i=0;i<r;i++){
            if (visited[i][0]==false && grid[i][0]==1){
                q.add(new Pair(i,0));
                visited[i][0]=true;
            }
        }
        for (int i=0;i<r;i++){
            if (visited[i][c-1]==false && grid[i][c-1]==1){
                q.add(new Pair(i,c-1));
                visited[i][c-1]=true;
            }
        }
        int res=0;
        
        
        
        while (!q.isEmpty()){
            int pr=q.peek().a;
            int pc=q.peek().b;
            q.poll();
            int[] delR={-1,0,1,0};
            int[] delC={0,1,0,-1};
            for (int i=0;i<4;i++){
                int nR=pr+delR[i];
                int nC=pc+delC[i];
            if (nR>=0 && nC>=0 && nR<grid.length && nC<grid[0].length && visited[nR][nC]==false && grid[nR][nC]==1){
                q.add(new Pair(nR,nC));
                visited[nR][nC]=true;

            }
        }
            
        }        
        
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (visited[i][j]==false && grid[i][j]==1) res++;
            }
        }
        
        return res;
        
    }
   
}