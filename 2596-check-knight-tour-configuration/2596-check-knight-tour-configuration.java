class Solution {
    int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
    int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0]!=0) return false;
        
        return recurse(grid,0,0,0);
    }

   
   boolean recurse(int[][] grid,int val,int r,int c){
       if (val==grid.length*grid[0].length-1) return true;
       // System.out.println(val);
       boolean ans=false;
        for (int i=0;i<8;i++){
            int newR=r+xMove[i];
            int newC=c+yMove[i];
    if (newR>=0 && newC>=0 && newR<grid.length && newC<grid[0].length && grid[newR][newC]==val+1){
                ans=ans|| recurse(grid,val+1,newR,newC);
            }
            
        } 
       return ans;
    }
}