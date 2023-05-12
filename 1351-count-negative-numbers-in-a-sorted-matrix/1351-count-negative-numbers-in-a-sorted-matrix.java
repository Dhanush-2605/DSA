class Solution {
    public int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int c=0;
        for (int[] arr:grid){
            for (int val:arr) if (val<0) c++;
        }
        return c;
    }
}