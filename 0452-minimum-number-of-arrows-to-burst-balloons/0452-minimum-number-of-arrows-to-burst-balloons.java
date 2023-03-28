class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));
        int n=points.length;
        // System.out.println(Arrays.deepToString(points));
        int res=1;
        int last=points[0][1];
        for (int j=0;j<n;j++){
                     

            if (points[j][0]>last){
                // i=j;
                res++;
                last=points[j][1];
            }
    
        }
        return res;
        
    }
}