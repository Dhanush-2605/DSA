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
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            int[] source = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                source[i] = x;
            }
            int[] dest = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                dest[i] = x;
            }
            Solution ob = new Solution();
            int ans = ob.shortestPath(grid, source, dest);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Pair{
    int d;
    int r;
    int c;
    Pair(int _d,int _r,int _c){
        this.d=_d;
        this.r=_r;
        this.c=_c;
    }
}
class Solution {

    int shortestPath(int[][] grid, int[] source, int[] destination) {
        int row=grid.length;
        int col=grid[0].length;
        int[][] dist=new int[row][col];
        for (int[] arr:dist){
            Arrays.fill(arr,Integer.MAX_VALUE);
        }
                // System.out.println(Arrays.deepToString(dist));

        dist[source[0]][source[1]]=0;
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>((a,b) -> a.d - b.d);
        pq.add(new Pair(0,source[0],source[1]));
        while (!pq.isEmpty()){
            int d=pq.peek().d;
            int r=pq.peek().r;
            int c=pq.peek().c;
            pq.remove();
            int[] delRow={-1,0,1,0};
            int[] delCol={0,1,0,-1};
            for (int i=0;i<4;i++){
                int newRow=r+delRow[i];
                int newCol=c+delCol[i];
                if (newRow>=0 && newCol>=0 && newRow<row && newCol<col && grid[newRow][newCol]==1){
                    // System.out.println(d+1 +" " + dist[newRow][newCol]);
                    if (d+1<dist[newRow][newCol]){
                        dist[newRow][newCol]=d+1;
                        pq.add(new Pair(d+1,newRow,newCol));
                    }
                    
                }
            }
        }
        // System.out.println(Arrays.deepToString(dist));
        int res=dist[destination[0]][destination[1]];
        if (res==Integer.MAX_VALUE) return -1;
        return res;

    }
}
