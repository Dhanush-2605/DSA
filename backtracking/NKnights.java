import java.time.temporal.TemporalUnit;

import java.util.*;

import javax.swing.text.StyledEditorKit;
public class NKnights {
    static List<List<String>> resu=new ArrayList<>();
    public static void main(String args[]){
        boolean[][] board=new boolean[4][4];
        int knight=4;
        knights(board, 0, 0, knight);
        System.out.println(resu);


    }
    static void knights(boolean[][] board,int r,int c,int knight){
        if (knight==0){
            addBoard(board);
            return;
        }
        if (r==board.length-1 && c==board.length){
            return;
        }
        if (c==board.length){
            knights(board, r+1, 0, knight);
            return;

        }
        if (isSafe(board, r, c)){
            board[r][c]=true;
            knights(board, r, c+1, knight-1);
            board[r][c]=false;
        }
        knights(board,r,c+1,knight);

    }
    static boolean isSafe(boolean[][] board,int r,int c){
        if (isValid(r-1,c+2,board)){
        if (board[r-1][c+2]){
            return false;

        }
    }
    if (isValid(r-2,c+1,board)){
        if (board[r-2][c+1]){
            return false;

        }
    }
    if (isValid(r-2,c-1,board)){
        if (board[r-2][c-1]){
            return false;


        }
    }
    if (isValid(r-1,c-2,board)){
        if (board[r-1][c-2]){
            return false;

        }
    }
    return true;

    }

    static boolean isValid(int r,int c,boolean[][] board){
        if (r >=0 && r<board.length && c>=0 && c<board.length ){
            return true;

        }
        return false;
    }
    private static  void addBoard(boolean[][] board) {
        String ans="";
        List<String> res=new ArrayList<>();
        System.out.println(Arrays.deepToString(board));
        System.out.println("---------------------------------------------------------");
        for (boolean[] row:board ){
            for (boolean elem:row){
                if (elem){
                    ans+="Q";

                }
                else{
                    ans+=".";
                }
            }
            res.add(ans);
            ans="";
           
        }
        
        resu.add(res);

    }
    
}
