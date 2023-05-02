class Solution {
    public int[][] merge(int[][] intervals) {
        int len=intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res=new ArrayList<>();   
      
        int start=intervals[0][0];
        int end=intervals[0][1];
        for (int[] arr:intervals){
            if (end>=arr[0]){    
                end=Math.max(end,arr[1]);               
          
            }
            else{
                res.add(new int[]{start,end});
                start=arr[0];
                end=arr[1];
            }
        }

        res.add(new int[]{start,end});

        return res.toArray(new int[0][]);


        
    }
}