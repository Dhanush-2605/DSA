//counting all paths
public class Maze1 {
    public static void main(String args[]){
        System.out.println(maze(0, 0));

    }
    static int maze(int r,int c){
        if (r==2 || c==2){
            return 1;
            
           
        }

      
            int left=maze(r,c+1);

   
            int right=maze(r+1,c);
            return left+right;

      
 
        


    }
}
