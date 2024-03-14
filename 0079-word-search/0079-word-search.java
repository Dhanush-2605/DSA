class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;

        boolean[][] visited = new boolean[n][m];
        
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(board[row][col] == word.charAt(0)){
                    if(dfs(row, col, word, 0, visited, board)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(int row, int col, String word, int lvl, boolean[][] visited, char[][] board){
        int n = board.length;
        int m = board[0].length;
        
        if(lvl == word.length()){
            return true;
        }
        
        if(row < 0 || row >= n || col < 0 || col >= m || visited[row][col] || board[row][col] != word.charAt(lvl)){
            return false;
        }
        
        visited[row][col] = true;
      
        boolean didFindNextCharacter = 
        dfs(row + 1, col, word, lvl + 1, visited, board)||
        dfs(row - 1, col, word, lvl + 1, visited, board)|| 
        dfs(row, col + 1, word, lvl + 1, visited, board)|| 
        dfs(row, col - 1, word, lvl + 1, visited, board);
        
        visited[row][col] = false;  
        return didFindNextCharacter;
    }
}
