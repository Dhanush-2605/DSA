class Pair{
    int a;
    int b;
    int d;
    Pair(int _a,int _b,int _d){
        this.a=_a;
        this.b=_b;
        this.d=_d;

    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int rL=mat.length;
        int cL=mat[0].length;
        boolean[][] visited=new boolean[rL][cL];
        int[][] res=new int[rL][cL];
        Queue<Pair> q=new LinkedList<>();
        for (int i=0;i<rL;i++){
            for (int j=0;j<cL;j++){
                if (mat[i][j]==0){
                    
                    q.add(new Pair(i,j,0));
                    visited[i][j]=true;
                }

            }
        }
        while (!q.isEmpty()){
            int r=q.peek().a;
            int c=q.peek().b;
            int prevD=q.peek().d;
            res[r][c]=prevD;
            q.poll();
            int[] delR={-1,0,1,0};
            int[] delC={0,1,0,-1};
            for (int i=0;i<4;i++){
                int nR=r+delR[i];
                int nC=c+delC[i];
                if (nR>=0 && nC>=0 && nR<rL && nC<cL && visited[nR][nC]==false){
                    q.add(new Pair(nR,nC,prevD+1));
                    visited[nR][nC]=true;
                }
            }

        }
        return res;

        
    }
}