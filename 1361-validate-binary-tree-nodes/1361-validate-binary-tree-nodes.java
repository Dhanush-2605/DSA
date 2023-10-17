class Solution {
    boolean ans=true;
  
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
            int[] parent=new int[n];
            Arrays.fill(parent,-1);

        boolean[] visited=new boolean[n]; 
      recurse(0,n,leftChild,rightChild,visited,parent);    

       for (int i=0;i<n;i++){
             if (leftChild[i]!=-1){
            parent[leftChild[i]]=i;
        }
          if (rightChild[i]!=-1){
            parent[rightChild[i]]=i;

        }
        }
        int ctn=0;
        for (int val:parent) if (val==-1) ctn++;
        if (ctn>1) return false;

       return ans;
    
    }
    void recurse(int i,int n,int[] leftChild,int[] rightChild,boolean[] vis,int[] parent){
        
        if (i==-1) return;
        if (vis[i]==true){
            ans=false;
            return;
        }
        vis[i]=true; 
        recurse(leftChild[i],n,leftChild,rightChild,vis,parent);
        recurse(rightChild[i],n,leftChild,rightChild,vis,parent);
        return;

    }
}