class Solution {
    public int numSpecial(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
int res=0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (mat[i][j]==1) res+=check(mat,i,j);

            }
        }
        return res;
    }
    int check(int[][] mat,int r,int c){
        int ctn1=0;
        int ctn2=0;
        for (int i=0;i<mat.length;i++){
            if (mat[i][c]==0) ctn1++;
        }
        for (int i=0;i<mat[0].length;i++){
            if (mat[r][i]==0) ctn2++;
        }
        if (ctn1==mat.length-1 && ctn2==mat[0].length-1) return 1;
        return 0;
    }
}