//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Pair{
    int a;
    int b;
    public Pair(int _a,int _b){
        this.a=_a;
        this.b=_b;
    }
}
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited=new boolean[V+1];
        
        for (int i=0;i<V;i++){
            if (visited[i]==false){
                if (findCycle(V,adj,i,visited)) return true;
            }
        }
        return false;
      
     
    }
    boolean findCycle(int V, ArrayList<ArrayList<Integer>> adj,int node,boolean visited[]){
        Queue<Pair> q=new LinkedList<>();

        q.add(new Pair(node,-1));
        while (!q.isEmpty()){
            int a=q.peek().a;
            int b=q.peek().b;
            q.poll();
            visited[a]=true;
            for (int val:adj.get(a)){
                if (visited[val]==false){
                q.add(new Pair(val,a));
                visited[val]=true;
                }
                else if (b!=val) return true;
            }
        }
        return false;
    }
        
    }
