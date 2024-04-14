class Solution {
    public boolean isValidSudoku(char[][] board) {
        int r=board.length;
        int c=board[0].length;
        HashSet<String> set=new HashSet<>();
  

        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (board[i][j]!='.'){
                char cur=board[i][j];
                // ArrayList<Integer> temp=new ArrayList<>();
                    String row= cur+" row " + String.valueOf(i);
                    String col= cur+" col " + String.valueOf(j);

                    String grid=cur+" in grid " + String.valueOf(i/3)+"-"+ String.valueOf(j/3);
                    if (set.contains(row) || set.contains(col) || set.contains(grid)) return false;

                // temp.add(i/3);
                 set.add(row);
                    set.add(col);
                    set.add(grid);
                
            }
            }

            
        }
        // System.out.println(set);
        return true;
        
    }
}