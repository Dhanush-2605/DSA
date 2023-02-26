//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            
            int[] ptr = ob.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Pair{
    int dist;
    int node;
    Pair(int _d,int _n){
        this.dist=_d;
        this.node=_n;
    }
}
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int[] dist=new int[V];
        Arrays.fill(dist,10000000);
        PriorityQueue<Pair> q=new PriorityQueue<Pair>((x,y)->x.dist-y.dist);
        dist[S]=0;
        q.add(new Pair(0,S));
        while (!q.isEmpty()){
            int n=q.peek().node;
            int d=q.peek().dist;
            q.remove();
            ArrayList<ArrayList<Integer>> cur=adj.get(n);
            for (ArrayList<Integer> temp:cur){
                int node=temp.get(0);
                int dis=temp.get(1);
                if (dis+dist[n]<dist[node]){
                    dist[node]=dis+dist[n];
                    q.add(new Pair(dis+dist[n],node));
                }
            }
        }
            
                    return dist;

        }
        
    }   
    
    
    


