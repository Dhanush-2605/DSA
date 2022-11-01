package miscellaneous;
import java.util.*;

public class MaxProduct2Elem {
    public static void main(String[] args) {
        int[] nums={3,4,5,2};
        Arrays.sort(nums);
        int i=0;
        int len=nums.length;      
        i=(nums[len-2]-1)*(nums[len-1]-1);
        System.out.println(i);
    }
}
