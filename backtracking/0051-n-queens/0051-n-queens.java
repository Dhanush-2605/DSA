class Solution {
            List<List<String>> res=new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        boolean[][] board=new boolean[n][n];      
        placeQueen(board,0);
        return res;
        
    }
    void placeQueen(boolean[][] board,int row){
        if (row==board.length){
            
            display(board);

            return;
        }
            
            for (int i=0;i<board.length;i++){
                if (isSafe(board,row,i)){
                    board[row][i]=true;
                    placeQueen(board,row+1);
                    board[row][i]=false;
                }
                
            }
        
    }
    boolean isSafe(boolean[][] board,int row,int col){
        for (int r=0;r<row;r++){
            if (board[r][col]) return false; 
        }        
        int maxLeft=Math.min(row,col);
        for (int i=1;i<=maxLeft;i++){
            if (board[row-i][col-i]) return false;
        }
        int maxRight=Math.min(row,board.length-col-1);
        for (int i=1;i<=maxRight;i++){
            if (board[row-i][col+i]) return false;
        }
        return true;
    }
    void display(boolean[][] board){
         ArrayList<String> cur =new ArrayList<>();
        String str="";

        for (boolean[] row:board){
            for (boolean val:row){
                if (val) str+="Q";
                else str+=".";
            }
            cur.add(str);
            str="";
        }
      res.add(cur);

    }
}