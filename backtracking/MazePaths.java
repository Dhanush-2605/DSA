import java.util.ArrayList;

public class MazePaths {
    public static void main(String args[]){
        System.out.println(recurse(0,0,""));

    }
    static ArrayList<String> recurse(int r,int c,String p){
        if (r==2 && c==2){ 
            
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> list=new ArrayList<>();
        if (r==c){
            list.addAll(recurse(r+1,c+1,p+"D")); 
        }
        if (r<2){
            list.addAll(recurse(r+1, c, p+"B"));
        }
        if (c<2){
            list.addAll(recurse(r, c+1, p+"R"));

        }
        return list;
    }
    
}
