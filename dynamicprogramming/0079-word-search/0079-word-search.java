class Solution {
       private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        visited = new boolean[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (board[i][j]==word.charAt(0) && helper(board,word,i,j,0)==true) return true;
            }
        }
        
        return false;
         
    }
    boolean helper(char[][] board,String word,int r,int c,int ind){
        if (ind==word.length()) return true;      

        if (r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!=word.charAt(ind) || visited[r][c]) return false;
        visited[r][c]=true;
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};
        
        boolean ans=false;
        for (int i=0;i<4;i++){
            int newRow=r+row[i];
            int newCol=c+col[i];
          ans=ans|| helper(board,word,newRow,newCol,ind+1);
        }        
        visited[r][c]=false;
        return ans;
        
        
    }
}