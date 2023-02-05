class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m=image.length;
        int n=image[0].length;
        int s=image[sr][sc];
        dfs(sr,sc,image,color,s);
        return image;
        
    }
    void dfs(int r,int c,int[][] image,int color,int s){

        if (r<0 || c<0 || r>=image.length || c>=image[0].length || image[r][c]!=s|| image[r][c]==color) return;
        image[r][c]=color;

        dfs(r-1,c,image,color,s);
        dfs(r,c-1,image,color,s);
        dfs(r+1,c,image,color,s);
        dfs(r,c+1,image,color,s);
        
        
        
    }
}