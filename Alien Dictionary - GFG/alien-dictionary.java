//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String findOrder(String [] dict, int N, int K){
        Queue<Integer> q=new LinkedList<>();
        ArrayList<ArrayList<Character>> adj=new ArrayList<>();
        ArrayList<ArrayList<Character>> strArr=new ArrayList<>();
        for (int i=0;i<N-1;i++){
            fillStrArr(strArr,dict[i],dict[i+1]);

        }
        for (int i=0;i<K;i++){
            ArrayList<Character> cur=new ArrayList<>();
            adj.add(cur);
        }
        for (ArrayList<Character> val:strArr){
                int ind=val.get(0)-'a';
                adj.get(ind).add(val.get(1));
        }
        
        
        int V=adj.size();
    //   System.out.println(adj);
        int[] inDegree=new int[V];
     for (int i=0;i<V;i++){
            for (char val:adj.get(i)){
                int ind=val-'a';
                inDegree[ind]++;
            }
        }
        for (int i=0;i<V;i++){
            
            if (inDegree[i]==0) q.add(i);
        }
        String res="";
        while (!q.isEmpty()){
            int cur=q.poll();
            if (inDegree[cur]==0){
                String curChar=Character.toString(97+cur);
                res+=curChar;
                // System.out.println(cur);
            }
            for (char val:adj.get(cur)){
                int ind=val-'a';
                inDegree[ind]--;
                if (inDegree[ind]==0) q.add(ind);
            }
        }

        return res;
        
    }
    void fillStrArr(ArrayList<ArrayList<Character>> l,String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        int i=0;
        int j=0;
        while (i<n1 && j<n2){
            if (s1.charAt(i)!=s2.charAt(j)){
                ArrayList<Character> cur=new ArrayList<>(); 

                cur.add(s1.charAt(i));
                cur.add(s2.charAt(j));
                l.add(cur);
                break;
            }
            i++;
            j++;
        }
        
    }
}