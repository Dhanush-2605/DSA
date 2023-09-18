class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int r=mat.length;
        int c=mat[0].length;
        int[][] ans=new int[r][c];
        
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                int rS=i-k;
                int rE=i+k;
                int cS=j-k;
                int cE=j+k;
                if (rS<0) rS=0;
                if (rE>=r) rE=r-1;
                if (cS<0) cS=0;
                if (cE>=c) cE=c-1;
                ans[i][j]=getSum(rS,rE,cS,cE,mat);
            }
        }
        return ans;
        
        
    }
    int getSum(int rs,int re,int cs,int ce,int[][] mat){
        int sum=0;
        for (int i=rs;i<=re;i++){
            for (int j=cs;j<=ce;j++){
                sum+=mat[i][j];
            }
        }
        return sum;
    }
}