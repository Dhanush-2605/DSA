//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.lps(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int lps(String s) {
        long p=31;
        long mod=1000000007;
        long pow=1;
        long ph=0;
        long sh=0;
        int ans=0;
        int n=s.length();
        for (int i=0;i<n-1;i++){
            ph=((ph*p)+(s.charAt(i)-'a'+1))%mod;
            sh=(sh+((s.charAt(n-i-1)-'a'+1)*pow)%mod)%mod;
            pow=(pow*p)%mod;
            if (ph==sh) ans=i+1;
        }
        // code here
        return ans;
    }
}