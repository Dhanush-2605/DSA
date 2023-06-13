class Solution {
    int ctn=0;
    public boolean isPossibleToCutPath(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
                    
        boolean res1=traverse(grid,0,0);
        grid[0][0]=1;
        boolean res2=traverse(grid,0,0);
        
        return res2==false?true:false;
        // if (res1==res2) return false;
        // return true;
        
                    
    
    
        
        
        
    }
    
    boolean traverse(int[][] grid,int r,int c){
        if (r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0) return false;
        if (r==grid.length-1 && c==grid[0].length-1) return true;
        grid[r][c]=0;
        return traverse(grid,r+1,c) || traverse(grid,r,c+1);
    }
}