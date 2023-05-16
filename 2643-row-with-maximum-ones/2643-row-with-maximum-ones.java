class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res=new int[2];
        int max=0;
        int r=mat.length;
        int c=mat[0].length;
        for (int i=0;i<r;i++){
            int ctn=0;
            for (int j=0;j<c;j++){
                if (mat[i][j]==1) ctn++;
            }
            if (ctn>max){
                max=ctn;
                res[0]=i;
                res[1]=ctn;
            }
        }
        return res;
        
    }
}