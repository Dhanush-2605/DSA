package miscellaneous;
import java.util.*;

public class Goodpairs {
   
        public static void main(String[] args){
            int[] nums={1,2,3,1,1,2,3};
            HashMap<Integer,Integer> map=new HashMap<>();
            int res=0;
            for (int num:nums){
                int count=map.getOrDefault(num,0);
                res+=count;
                map.put(num,count+1);
       
            }
            System.out.println(res);
        }
    
    
}
