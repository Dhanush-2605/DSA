package miscellaneous;
import java.util.*;
public class Productexceptself{
	public static void main(String[] args) {
		// System.out.println("Hello World");
		// int[] arr={-1,1,0,-3,3};
        // int[] res=new int[arr.length];

        // int ind=0;
        // int c=0;
		
		// for (int i=0;i<arr.length;i++){
		//     int cur=arr[i];
		//     int product=1;
		//     for (int j=0;j<arr.length;j++){
		//         if (arr[j]==cur && c==0){
        //             c=1;
		//             continue;
		//         }
		//         product=product*arr[j];
		        
		        
		//     }
        //     c=0;
		//     res[ind]=product;
        //     ind++;
		// }
		// System.out.println(Arrays.toString(res));




	    int[] nums={1,2,3,4};
        int n=nums.length;
        ArrayList<Integer> num=new ArrayList<Integer>(n);
       for (int i=0;i<n;i++){
           num.add(nums[i]);
       }
        ArrayList<Integer> left=new ArrayList<>(n);
        Collections.fill(left,1);
      
       
         ArrayList<Integer> right=new ArrayList<>(n);
         Collections.fill(right,1);
        //  ArrayList<Integer> res=new ArrayList<>(n);
          for (int i=1;i<n;i++){
            // left.set(i,left.get(i-1)*num.get(i-1));
            System.out.println(right.get(i));
        }
 
        // for (int i=1;i<n;i++){
        //     left.set(i,left.get(i-1)*num.get(i-1));
        // }
//   Collections.reverse(num);
        // for(int i=1;i<n;i++){
        //     right.set(i,right.get(i-1)*num.get(i-1));
        // }
//   Collections.reverse(right);
    //     for (int i=0;i<n;i++){
    //       System.out.println(right.get(i));
    //   }
        // for (int i=0;i<n;i++){
        //     res.set(i,left.get(i)*right.get(i));
        // }
        // int[] finalres=new int[n];
        // for (int i=0;i<n;i++){
        //     finalres[i]=res.get(i);
        // }
	




	}


}