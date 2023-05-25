class Pair{
    int a;
    int b;
    Pair(int _a,int _b){
        this.a=_a;
        this.b=_b;
    }
}
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((p1,p2)->p2.a-p1.a);
        boolean[] visited=new boolean[nums.length];
        for (int i=0;i<nums.length;i++){
            Pair p1=new Pair(nums[i],i);
            pq.add(p1);
        }
        for (int i=0;i<k;i++){
            Pair p=pq.poll();
            visited[p.b]=true;
        }
        int[] ans=new int[k];
        int ind=0;
        for (int i=0;i<nums.length;i++){
            if (visited[i]==true){
                ans[ind++]=nums[i];                
            }
        }
        return ans;
    }
}