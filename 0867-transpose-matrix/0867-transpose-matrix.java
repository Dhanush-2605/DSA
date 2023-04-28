class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int nR=0;
        int nC=0;
        int[][] tr=new int[c][r];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                tr[nR][nC]=matrix[i][j];
                nR++;
            }
            nC++;
            nR=0;
        }
        return tr;
    }
}