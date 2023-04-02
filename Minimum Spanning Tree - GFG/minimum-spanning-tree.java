//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends

class UFD{
    List<Integer> parent=new ArrayList<>();
    List<Integer> size=new ArrayList<>();
    UFD(int n){
        for (int i=0;i<=n;i++){
            parent.add(i);
            size.add(1);
        }
    }
    int findUpar(int node){
        if (node==parent.get(node)) return node;
        int ulp=findUpar(parent.get(node));
        parent.set(node,ulp);
        return parent.get(node);
        
    }
    void unionBySize(int u,int v){
        int ulp_u=findUpar(u);
        int ulp_v=findUpar(v);
        if (ulp_v==ulp_u) return;
        if (size.get(ulp_v)>size.get(ulp_u)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v,size.get(ulp_v)-size.get(ulp_u));
        }else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u)-size.get(ulp_v));      
        }
    }
};
   

class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	    UFD ds=new UFD(V);
	    int res=0;
	    Arrays.sort(edges,(a,b)->a[2]-b[2]);
	   // System.out.println(Arrays.deepToString(edges));
	    for (int[] arr:edges){
	        
	        if (ds.findUpar(arr[0])!=ds.findUpar(arr[1])){
	            res+=arr[2];
	            ds.unionBySize(arr[0],arr[1]);
	        }
	    }
	    return res;
	}
}