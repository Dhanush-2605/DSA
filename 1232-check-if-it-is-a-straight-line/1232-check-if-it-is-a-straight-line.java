class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int X=coordinates[0][0]-coordinates[1][0];
        int Y=coordinates[0][1]-coordinates[1][1];

        // System.out.println(slop);
        int n=coordinates.length;
        for (int i=2;i<n;i++){
            int newX=coordinates[i][0]-coordinates[0][0];
            int newY=coordinates[i][1]-coordinates[0][1];
           
            if (newY*X!=newX*Y) return false;
        }
        
        return true;
        
    }
}