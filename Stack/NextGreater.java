package Stack;
import java.lang.reflect.Array;
import java.util.*;
public class NextGreater {
    public static void main(String[] args) {
        int[] nums={4,12,5,3,1,2,5,3,1,2,4,6};
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        int[] res=new int[n+1];
        int ind=n;
        res[ind]=-1;
        ind--;
        // int m=
        // int n=nums.length-1;
        for (int i=2*n-1;i>=0;i--){
            while (!stack.isEmpty() && stack.peek()<=nums[i%n]) stack.pop();
            if (i<n){
                if (!stack.isEmpty()){
                    res[i]=stack.peek();

                }else{
                    res[i]=-1;
                }
            }
            stack.push(nums[i%n]);

        }
        System.out.println(Arrays.toString(res));
        // stack.push(nums[n]);
        // for (int i=n-2;i>=0;i--){
        //     if (!stack.isEmpty()){
        //     if (stack.peek()>nums[i]){
        //         res[ind]=stack.peek();
        //         stack.push(nums[i]);

        //         ind--;
        //     }else{
        //         // if (){
        //         while (!stack.isEmpty() && stack.peek()<=nums[i]){
        //             stack.pop();
        //         // }
        //     }
        //      if (!stack.isEmpty()){
        //         res[ind]=stack.peek();
        //         stack.push(nums[i]);
        //         ind--;
        //      }
        //     }
        // }
                 
        // }
        System.out.println(Arrays.toString(res));

    }
    
}
