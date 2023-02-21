//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public int[] shortestPath(int N,int M, int[][] edges) {
	ArrayList<ArrayList<ArrayList<Integer>>> adj=new ArrayList<>();
	for (int i=0;i<N;i++){
	    ArrayList<ArrayList<Integer>> cur=new ArrayList<>();
	    adj.add(cur);
	}

	     for (int[] arr:edges){
	       ArrayList<Integer> cur=new ArrayList<>();
	       int node=arr[0];
	       cur.add(arr[1]);
	       cur.add(arr[2]);
	       adj.get(node).add(cur);
	         
	     }
	     

	 boolean[] visited=new boolean[N];
	 Stack<Integer> st=new Stack<>();
	 for (int i=0;i<N;i++){
	     if (visited[i]==false) topoSort(i,adj,st,visited);
	 }
	 int[] ans=new int[N];
	 Arrays.fill(ans,10000000);
	  	//  System.out.println(st);
	 ans[0]=0;

	 while (!st.isEmpty()){
	     int top=st.pop();
	     ArrayList<ArrayList<Integer>> curNode=adj.get(top);
	     int dist=ans[top];
	     for (ArrayList<Integer> arr:curNode){
	         int curnode=arr.get(0);
	         if (dist+arr.get(1)<ans[curnode]){
	            ans[curnode]=dist+arr.get(1);
	         }
	     }
	 }
	 for (int i=0;i<N;i++){
	     if (ans[i]==10000000) ans[i]=-1;
	 }
	 return ans;
	 
	}
	void topoSort(int node,	ArrayList<ArrayList<ArrayList<Integer>>> adj,Stack<Integer> st,boolean[] visited){
	    visited[node]=true;
	    ArrayList<ArrayList<Integer>> curNode=adj.get(node);
	    for (ArrayList<Integer> arr:curNode){
	        if (visited[arr.get(0)]==false) topoSort(arr.get(0),adj,st,visited);
	    }
	    
	    st.add(node);
	    
	    
	}
	    
// 	}
}