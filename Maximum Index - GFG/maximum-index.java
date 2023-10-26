//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim()); // size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    
		    Solution ob = new Solution();
		    
		    System.out.println(ob.maxIndexDiff(arr, n)); // print the result
		}
	}
}
// } Driver Code Ends


class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int A[], int N) { 
        int[] prefix=new int[N];
        int[] suffix=new int[N];
        prefix[0]=A[0];
        suffix[N-1]=A[N-1];
        for (int i=1;i<N;i++){
            prefix[i]=Math.min(prefix[i-1],A[i]);
            suffix[N-i-1]=Math.max(suffix[N-i],A[N-i-1]);
        }
        int i,j,ans;
        i=j=ans=0;
        while (j<N){
            if (prefix[i]<=suffix[j]){
                ans=Math.max(ans,j-i);
                j++;
            }
            else i++;
        }
        return ans;

    }
}


