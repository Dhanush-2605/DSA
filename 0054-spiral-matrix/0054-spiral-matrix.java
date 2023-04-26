class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        // int[] res=new int[m*n];
        List<Integer> res=new ArrayList<>();
        recurse(0,0,m,n,res,matrix);
        return res;
        
        
    }
    void recurse(int i,int j,int m,int n,List<Integer> arr,int[][] matrix){
        if (i>=m || j>=n) return;
        for (int p=i;p<n;p++){
            arr.add(matrix[i][p]);
          
        }
        for (int p=i+1;p<m;p++){
            arr.add(matrix[p][n-1]);
          
        }
        if ((m-1)!=i){
            for (int k=n-2;k>=j;k--){
                arr.add(matrix[m-1][k]);
               
            }
            
        }
        if ((n-1)!=j){
            for (int k=m-2;k>i;k--){
                arr.add(matrix[k][j]);
            }
            
        }
        recurse(i+1,j+1,m-1,n-1,arr,matrix);
    }
    
}