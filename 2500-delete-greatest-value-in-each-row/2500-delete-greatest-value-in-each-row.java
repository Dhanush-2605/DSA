class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int res=0;
        int r=grid.length;
        int c=grid[0].length;
        for (int[] arr:grid){
            Arrays.sort(arr);
        }
        for (int i=c-1;i>=0;i--){
            int max=-1;
            for (int j=0;j<r;j++){
                max=Math.max(max,grid[j][i]);
                
            }

            res+=max;
        }
        return res;
        
    }
}