class Solution {
    
    public int findTheCity(int m, int[][] arr, int distanceThreshold) {
        
      int n = m;
        int[][] matrix=new int[n][n];
        for (int[] cur:matrix) Arrays.fill(cur,10000000);

        for (int[] cur:arr){
            matrix[cur[0]][cur[1]]=cur[2];
            matrix[cur[1]][cur[0]]=cur[2];

        }
            for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==j) matrix[i][j]=0;
            }
        }
        

        
        for(int k=0; k<n; k++)
        {
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k]+matrix[k][j]);
                }
            }
        }
        int city=n+1;
        int cMax=0;
        for (int i=0;i<n;i++){
            int ctn=-1;
            for (int j=0;j<n;j++){
                if (distanceThreshold>=matrix[i][j]) ctn++;
            }
            if (city>=ctn){
                city=ctn;
                cMax=i;
            }
        }
      
        return cMax;
        
    }
}