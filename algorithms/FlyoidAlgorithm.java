package algorithms;
import java.util.*;
// link -> https://leetcode.com/problems/happy-number/

public class FlyoidAlgorithm {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        
    }
    public static  boolean isHappy(int n) {
        
        HashSet<Integer> set=new HashSet<Integer>();
        while (n!=1){
            int current=n;
            int sum=0;
            while (current!=0){
                int rem=current%10;
                sum+=rem*rem;
                current=current/10;
            }
            if (!set.add(sum)){
                return false;
                
            }
            set.add(sum);
            n=sum;
        }
        return true;
        
    }
}
