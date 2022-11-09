import java.util.*;
public class PascalsTriangle {
    public static void main(String[] args) {


          
        System.out.println("Hello World");
        int n=30;
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        res.add(1);
        l.add(res);
        for (int i=2;i<=n;i++){
            int[] arr=new int[i];
            List<Integer> curRes=new ArrayList<>();
            arr[0]=1;
            arr[i-1]=1;
            List<Integer> cur=l.get(i-2);
            int ind=0;
            for (int j=1;j<=arr.length-2;j++){
                arr[j]=cur.get(ind)+cur.get(ind+1);
                ind++;
            }
            for (int num:arr) curRes.add(num);
            l.add(curRes);
            
            
        }
        System.out.println(l);
    }
}
