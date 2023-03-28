class Solution {
    public int jobScheduling(int[] start, int[] end, int[] profit) {
		int n=start.length;
		int[][] jobs=new int[n][3];
        TreeMap<Integer,Integer> map=new TreeMap<>();
        map.put(0,0);
		for (int i=0;i<n;i++){
		    jobs[i]=new int[]{start[i],end[i],profit[i]};
		    
		}
            Arrays.sort(jobs,(a,b)->a[1]-b[1]);

		for (int[] job:jobs){
		    int val=job[2]+map.floorEntry(job[0]).getValue();
		    if (val>map.lastEntry().getValue()){
		        map.put(job[1],val);
		    }
		}
		return map.lastEntry().getValue();
    }
}