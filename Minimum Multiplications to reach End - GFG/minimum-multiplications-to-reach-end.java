//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Pair{
    int a;
    int d;
    Pair(int _a,int _d){
        this.a=_a;
        this.d=_d;
    }
}
class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {
        Queue<Pair> pq=new LinkedList<>();
        int[] dis=new int[100000];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[start]=0;
        pq.add(new Pair(start,0));
        while (!pq.isEmpty()){
            int s=pq.peek().a;
            int d=pq.peek().d;
            pq.remove();
            for (int i=0;i<arr.length;i++){
                int newNode=(s*arr[i])%100000;
                int newDist=d+1;
                if (dis[newNode]>newDist){
                    dis[newNode]=newDist;
                    if (newNode==end) return newDist;
                pq.add(new Pair(newNode,newDist));
                }
            }
        }

     return -1;
    }
}
