class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int len=intervals.length;
        int c=0;
        int ind=1;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int prevEnd=intervals[0][1];
        while (ind<len){
            if (intervals[ind][0]>=prevEnd){
                prevEnd=intervals[ind][1];

            }
            else{
                c++;
                prevEnd=Math.min(intervals[ind][1],prevEnd);
            }
            ind++;

        }
  
        return c;
    }
}