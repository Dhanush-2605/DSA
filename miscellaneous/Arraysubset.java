package miscellaneous;

public class Arraysubset {
    public static void main(String[] args) {
		int[] arr={ 3, 5, 7, 12, 1, 9, 10, 0, 2 };
		int[] arr2={ 6, 3, 8 };
		int count=0;
		for (int i=0;i<arr2.length;i++) {
		    int cur=arr2[i];
		    for (int j=0;j<arr.length;j++){
		        if (arr[j]==cur){
		            count++;
		            break;
		        }
		        
		    }
		}
		if (count==arr2.length){
		    System.out.println("subset");
        }
		else{
            System.out.println("not subset");

		}
    }
}
