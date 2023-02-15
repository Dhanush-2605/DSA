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

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
       Set<ArrayList<Integer>> set=new HashSet<>();

    int countDistinctIslands(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        boolean[][] visited=new boolean[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (visited[i][j]==false && grid[i][j]==1){
                      ArrayList<Integer> l=new ArrayList<>();
                    dfs(i,j,i,j,visited,grid,l);
                    set.add(l);
                }
            }
        }
        return set.size();
    }
  void dfs(int r,int c,int br,int bc,boolean[][] visited,int[][] grid,ArrayList<Integer> arr){
      visited[r][c]=true;
      arr.add(br-r);
      arr.add(bc-c);
      int[] delR={-1,0,1,0};
      int[] delC={0,1,0,-1};
      for (int i=0;i<4;i++){
          int nR=r+delR[i];
          int nC=c+delC[i];
          if (nR>=0 && nC>=0 && nR<grid.length && nC<grid[0].length && visited[nR][nC]==false && grid[nR][nC]==1){
              dfs(nR,nC,br,bc,visited,grid,arr);
          }
         
      }
  }
}
