package algorithms;

// Link -> https://www.youtube.com/watch?v=n5QY3x_GNDg&t=390s

//used to find max repeating element in array 

// TC-> O(N);
// SC-> O(1)
public class MoorVotingAlgo {
    public static void main(String[] args) {
        int[] nums={3,1,3,3,3,1};
		int can=0;
		int count=1;
		for (int num:nums){
		    if (num==can) count++;
		    else{
                count--;

		        if (count==0){
		            can=num;
		            count=1;
		        }
		        
		    }
		    
		}
		System.out.println(can);
    }
    
}

