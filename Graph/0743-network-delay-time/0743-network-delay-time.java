class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        dist[0]=0;
        for (int i=0;i<n-1;i++){
            for (int[] arr:times){
                int sNode=arr[0];
                int eNode=arr[1];
                int dis=arr[2];
         if (dist[sNode]!=Integer.MAX_VALUE &&dist[sNode]+dis<dist[eNode]) dist[eNode]=dist[sNode]+dis;
                
            }
        }
        int max=Integer.MIN_VALUE;
        for (int val:dist){
            if (val>max) max=val;
        }
        if (max==Integer.MAX_VALUE) return -1;
        return max;
    }
}