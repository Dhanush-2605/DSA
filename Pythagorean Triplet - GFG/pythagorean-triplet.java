//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            boolean ans = new Solution().checkTriplet(arr, n);
            System.out.println(ans ? "Yes" : "No");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    boolean checkTriplet(int[] arr, int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int val:arr){
            int cur=val*val;
            if (map.containsKey(cur)) map.put(cur,map.get(cur)+1);
            else map.put(cur,1);
        }
        // System.out.println(map);
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                int temp=arr[i]*arr[i]+arr[j]*arr[j];
                // System.out.println(temp);
                if (map.containsKey(temp)) return true;
                
            }
            
        }
        return false;
    }
}