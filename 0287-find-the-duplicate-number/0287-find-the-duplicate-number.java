class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        boolean[] vis=new boolean[n+1];
        for (int i=0;i<n;i++){
            int v=nums[i];
            if (vis[v]==true) return v;
            vis[v]=true;
        }
        return -1;
        
    }
}