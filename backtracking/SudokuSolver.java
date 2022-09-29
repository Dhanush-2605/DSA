import java.io.Console;

public class SudokuSolver {
    public static void main(String args[]){
        int[][] board = new int[][]{
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
    };
    System.out.println(sudoku(board));
    if (sudoku(board)){
     
        display(board);

    }else{
        System.out.println("cannot solve");
    }
    }
    static boolean sudoku(int[][] board){
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean left=true;

        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    left=false;
                    break;
                }
             
            }
            if (left==false){
                break;
            }
        }
        if (left==true){
            return true;
        }

        for (int num=1;num<=9;num++){
            if (isSafe(board,row,col,num)){
                board[row][col]=num;
                if (sudoku(board)){
                    return true;
                }
                else{
                    board[row][col]=0;
                }

            }

        }
        return false;

    }

    private static void display(int[][] board) {
        for(int[] row : board) {
            for(int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] board,int row,int col,int num){
        //checking row
        for (int i=0;i<board.length;i++){
            if (board[row][i]==num) return false;

        }
        //colum
        for (int[] nums:board ){
            if (nums[col]==num) return false;

        }
        //grid
        int sqr=(int)Math.sqrt(board.length);
        int rowStart=row-row%sqr;
        int colStart=col-col%sqr;
        for (int r=rowStart;r<rowStart+sqr;r++){
            for (int c=colStart;c<colStart+sqr;c++){
                if (board[r][c]==num) return false;
            }
        }
        return true;

    }
    
}
