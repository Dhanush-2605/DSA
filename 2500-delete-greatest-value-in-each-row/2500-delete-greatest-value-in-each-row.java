class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int res=0;
        for (int[] arr:grid){
            Arrays.sort(arr);
        }
        int c=grid[0].length-1;
        int r=grid.length;
        for (int i=c;i>=0;i--){
            int temp=Integer.MIN_VALUE;
            for(int j=0;j<r;j++){
                temp=Math.max(grid[j][i],temp);
            }
            res+=temp;
        }
        return res;
        
    }
}