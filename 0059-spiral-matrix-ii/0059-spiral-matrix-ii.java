class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] res=new int[n][n];
        recurse(0,0,n,n,res,1);
        return res;
        
    }
    void recurse(int i,int j,int m,int n,int[][] res,int ind){
        if (i>=m || j>=n) return;
        for (int k=i;k<n;k++){
            res[i][k]=ind;
            ind++;
        }
        for (int k=i+1;k<m;k++){
            res[k][n-1]=ind;
            ind++;
        }
        if ((m-1)!=i){
            for (int k=n-2;k>=j;k--){
                res[m-1][k]=ind;
                ind++;
            }
        }
        if ((n-1)!=j){
            for (int k=m-2;k>i;k--){
                res[k][j]=ind;
                ind++;
            }  
        }
        recurse(i+1,j+1,m-1,n-1,res,ind);
    }
}