import java.util.*;

// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top
class ClimbingStairs{
    public static void main(String[] args) {
        HashMap<Integer,Integer> res=new HashMap<>();
        int n=3;
        res.put(0,1);
        res.put(1,1);
        int result=recurse(n,res);
        System.out.println(result);     
        
    }
    static int recurse(int n,HashMap<Integer,Integer> res){
        if (res.getOrDefault(n,0)!=0) return res.get(n);
        if (n==0) return 1;
        if (n==1) return 1;
        int l=recurse(n-1,res);
        int r=recurse(n-2,res);
        res.put(n,l+r);
        return l+r;
    }
}