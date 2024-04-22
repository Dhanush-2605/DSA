class Solution
{
    HashSet<String> set = new HashSet<>();
    HashSet<String> list = new HashSet<>();
    int max = -1;
    
    public List<String> findWords(char[][] board, String[] words)
    {
        for(String s: words)
        {
            set.add(s);
            max = Math.max(max,s.length());
        }
        
        for(int i=0; i<board.length;i++)
        {
            for(int j=0; j<board[0].length;j++)
            {
                boolean[][] visited = new boolean[board.length][board[0].length];
                StringBuilder sb = new StringBuilder();
                helper(i , j , sb , board , visited);
            }
        }
        return new ArrayList<>(list);
    }
    private void helper(int r , int c , StringBuilder sb , char[][] board , boolean[][] visited)
    {
        if(r >=0 && r < board.length && c >=0 && c < board[0].length && visited[r][c] == false && sb.length() < max)
        {
            sb.append(board[r][c]);
            String temp = sb.toString();
            
            if(set.contains(temp))
                list.add(temp);
            
            visited[r][c] = true;
            
            helper(r+1,c,sb,board,visited);
            helper(r,c+1,sb,board,visited);
            helper(r-1,c,sb,board,visited);
            helper(r,c-1,sb,board,visited);
            
            visited[r][c] = false;
            sb.deleteCharAt(sb.length()-1);
        }
        return;
    }
}
