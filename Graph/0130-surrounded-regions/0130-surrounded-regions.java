class Solution {
    public void solve(char[][] board) {
    int r=board.length;
    int c=board[0].length;
    
    boolean[][] visited=new boolean[r][c];
        for (int i=0;i<c;i++){
            if (visited[0][i]==false && board[0][i]=='O') bfs(board,visited,0,i);
        }
       for (int i=0;i<c;i++){
            if (visited[r-1][i]==false && board[r-1][i]=='O') bfs(board,visited,r-1,i);
        }
        
       for (int i=0;i<r;i++){
            if (visited[i][0]==false && board[i][0]=='O') bfs(board,visited,i,0);
        }
        
       for (int i=0;i<r;i++){
            if (visited[i][c-1]==false && board[i][c-1]=='O') bfs(board,visited,i,c-1);
        }
    for (int i=0;i<r;i++){
        for (int j=0;j<c;j++){
            if (board[i][j]=='O' && visited[i][j]==false) board[i][j]='X';
        }
    }
        
    }
    void bfs(char[][] board,boolean[][] visited,int r,int c){
        
        visited[r][c]=true;
        int[] delRow={-1,0,+1,0};
        int[] delCol={0,+1,0,-1};
        for (int i=0;i<4;i++){
            int nR=r+delRow[i];
            int nC=c+delCol[i];
            if (nR>=0 && nC>=0 && nR<board.length && nC<board[0].length && visited[nR][nC]==false  && board[nR][nC]=='O') bfs(board,visited,nR,nC);
            
            
        }
    }
    
}