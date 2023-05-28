class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();        
        recurse(0,0,matrix.length,matrix[0].length,res,matrix);
        return res;
        
        
    }
    void recurse(int i,int j,int m,int n,List<Integer> res,int[][] matrix){
        if (i>=m || j>=n) return;
        for (int p=i;p<n;p++){
            res.add(matrix[i][p]);
        }
        for (int p=i+1;p<m;p++){
            res.add(matrix[p][n-1]);
        }
        if (i!=m-1){
            for (int p=n-2;p>=j;p--){
                res.add(matrix[m-1][p]);
            }
        }
       if (j!=n-1){
            for (int p=m-2;p>i;p--){
                res.add(matrix[p][j]);
            }
        }
    recurse(i+1,j+1,m-1,n-1,res,matrix);
  
  
    }
}