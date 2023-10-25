//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String line1[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int W = Integer.parseInt(line1[1]);
            String line2[] = in.readLine().trim().split("\\s+");
            int val[] = new int[N];
            for(int i = 0;i < N;i++)
                val[i] = Integer.parseInt(line2[i]);
            String line3[] = in.readLine().trim().split("\\s+");
            int wt[] = new int[N];
            for(int i = 0;i < N;i++)
                wt[i] = Integer.parseInt(line3[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.knapSack(N, W, val, wt));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int knapSack(int N, int W, int val[], int wt[])
    {
        int[][] dp=new int[N][W+1];
        for (int[] arr:dp) Arrays.fill(arr,-1);
        return recurse(0,val,wt,W,dp);
    }
    static int recurse(int ind,int[] val,int[] wt,int W,int[][] dp){
        if (ind>=val.length || W<=0) return 0;
        if (dp[ind][W]!=-1) return dp[ind][W];
        
        int notTake=recurse(ind+1,val,wt,W,dp);
        int take=Integer.MIN_VALUE;
        if (W-wt[ind]>=0) take=val[ind]+recurse(ind,val,wt,W-wt[ind],dp);
        
        return dp[ind][W]=Math.max(take,notTake);
    }
}