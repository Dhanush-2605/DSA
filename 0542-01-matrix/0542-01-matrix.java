class Pair{
    int n1;
    int n2;
    int c;
    public Pair(int _a,int _b,int _c){
        this.n1=_a;
        this.n2=_b;
        this.c=_c;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Queue<Pair> q=new LinkedList<Pair>();

        boolean[][] visited=new boolean[m][n];
        int[][] res=new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (mat[i][j]==0){
                    // visited[i][j]=true;
                    // bfs(mat[i][j]);
                    q.add(new Pair(i,j,0));
                    visited[i][j]=true;
                }
            }
        }
  
        while (!q.isEmpty()){
            int a=q.peek().n1;
            int b=q.peek().n2;
            int prev=q.peek().c;
            res[a][b]=prev;
            q.remove();

        int[] delR={-1,0,1,0};
        int[] delC={0,1,0,-1};
        for (int i=0;i<4;i++){
            int r=a+delR[i];
            int c=b+delC[i];
            if (r>=0 && r<mat.length && c>=0 && c<mat[0].length && visited[r][c]==false){
                visited[r][c]=true;
                q.add(new Pair(r,c,prev+1));

            }            
        }         
        }
        return res;
    }

}