package I_ques;
//  Given an array of N elements and an input K, for every subarray of length K, print the most negative number if it exists or else print 0.


public class NegativeNumInSubset {
    public static void main(String[] args) {
		int[] arr={-2,5,6,-34,-56,-345,-342,5,56,-23,-45,23,-234};
		int k=3;
		int l=0;
		int e=k;
		while (e<=arr.length){
		    int min=0;
		    for (int i=l;i<e;i++){
		        if (arr[i]<0 && arr[i]<min){
		            min=arr[i];
		            
		        }
		    }
		    
		    System.out.println(min);
		    l++;
		    e++;
		        
		    }
    }
    
}
