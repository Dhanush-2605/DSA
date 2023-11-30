//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestUniqueSubsttr(String S){
        int l=0;
        int r=0;
        int n=S.length();
        Set<Character> set=new HashSet<>();
        int res=0;
        while (r<n){
            char ch=S.charAt(r);
            if  (set.add(ch)){
                r++;
                res=Math.max(res,set.size());
            }
            else{
                set.remove(S.charAt(l));
                l++;
                
            }
            
            

            
        }
        return res;
        
    }
}