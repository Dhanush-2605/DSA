public class MazeObstacles {
    public static void main(String args[]){
        boolean[][] arr={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };
System.out.println(recurse(arr, 0, 0));

    }
    //NO OF PATHS
    static int recurse(boolean[][] maze,int r,int c){
        if (r==2 && c==2){
            return 1;

        }
        if (!maze[r][c]){
            return 0;

        }
        int res=0;
        if (r<2){
            res+=recurse(maze, r+1, c);
        }
        if (c<2){
            res+=recurse(maze, r, c+1);
        }

        return res;

    }
    
}
