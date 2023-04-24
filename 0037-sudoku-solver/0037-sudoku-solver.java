class Solution {
    public void solveSudoku(char[][] board) {
        if(board == null || board.length < 9){
            return;
        }

        solve(board);

    }
    
    boolean solve(char[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean isEmpty = true;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == '.'){
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;  //come out of that part as already found an empty
                }
            }
            if(!isEmpty){
                break;
            }
        }
        if(isEmpty){
            return true;  // SOLVED
        }

        for(char num = '1'; num <= '9'; num++){
            if(isSafe(board, row, col, num)) {
                board[row][col] = num;
                if(solve(board)){ // you inserted a number and it is correct then alright
                    return true;
                }
                else{ // but what if the number entered is not correct, then we have to reset it and start again
                    board[row][col] = '.';
                }
            }
        }
        
        return false; // can not be solved
    }
    
    boolean isSafe(char[][] board, int row, int col, char num){
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }

        for(char[] nums : board){
            if(nums[col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));

        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for(int i = rowStart; i < rowStart + sqrt; i++){
            for(int j = colStart; j < colStart + sqrt; j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
       
        return true;
    }
}