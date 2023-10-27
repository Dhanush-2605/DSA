//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.minimumNumberOfDeletions(S));
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minimumNumberOfDeletions(String S) {
        int n=S.length();
        int[][] dp=new int[n][n];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        
        return recurse(S,0,n-1,dp);
    }
    static int recurse(String str,int s,int e,int[][] dp){
        if (s>=e) return 0;
        if (dp[s][e]!=-1) return dp[s][e];
        int take=Integer.MAX_VALUE;
        int notTake=Integer.MAX_VALUE;
        if (str.charAt(s)==str.charAt(e)){
            take=recurse(str,s+1,e-1,dp);
        }
        else{
            notTake=Math.min(1+recurse(str,s+1,e,dp),1+recurse(str,s,e-1,dp));
        }
        return dp[s][e]=Math.min(take,notTake);
    }
}