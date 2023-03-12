class Solution {

    
    public void setZeroes(int[][] matrix) {
    int row=matrix.length;
    int col=matrix[0].length;
    int[][] res=new int[row][col];
    for (int i=0;i<row;i++){
        for (int j=0;j<col;j++){
            res[i][j]=matrix[i][j];
        }
    }
    for (int i=0;i<row;i++){
        for (int j=0;j<col;j++){
            if (matrix[i][j]==0){

                fillZeros(i,j,res,row,col);
            }
        }

    }
for (int i=0;i<row;i++){
    for (int j=0;j<col;j++){
        matrix[i][j]=res[i][j];
    }
}
    
    }
void fillZeros(int r,int c,int[][] res,int row,int col){
    for (int i=0;i<col;i++){
        res[r][i]=0;
    }
    for (int j=0;j<row;j++){
        res[j][c]=0;
    }
}
}