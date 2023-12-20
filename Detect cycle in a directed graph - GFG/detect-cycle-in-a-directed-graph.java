//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    // for (int val:den)
    boolean res=false;
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // System.out.println(adj);
        boolean[] visited=new boolean[V];
        boolean[] path=new boolean[V];
        // int node=0;
        for (int i=0;i<V;i++){
            if (visited[i]==false) if (Dfs(adj,i,visited,path)==true) return true;
        }
        return false;
        // return res;
        // code here

    }
    boolean Dfs(ArrayList<ArrayList<Integer>> adj,int ind,boolean[] visited,boolean[] path){
   
        // if (ind>=adj.size()) return;
        // if (visited[ind]==true && path[ind]==true){
        //     res=true;
        //     return;
        // }
        // if (visited[ind]==false){
            visited[ind]=true;
            path[ind]=true;
        ArrayList<Integer> adjNode=adj.get(ind);
        
        for (int val:adjNode){
            if (visited[val]==false){
               if (Dfs(adj,val,visited,path)==true) return true;
            }
            else if (path[val]==true) return true;
        }
        // }
        path[ind]=false;
        return false;
        
    }
} 