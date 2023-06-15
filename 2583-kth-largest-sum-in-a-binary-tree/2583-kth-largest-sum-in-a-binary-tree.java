/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q=new LinkedList<>();
     PriorityQueue<Long> pq = new PriorityQueue<>(new Comparator<Long>() {
            @Override
            public int compare(Long a, Long b) {
                return Long.compare(b, a);
            }
        });    
        
        q.add(root);
        long top=root.val;
        pq.add(top);
        int level=1;
        while (!q.isEmpty()){
            level++;
            
            int n=q.size();
            long sum=0;
            for (int i=0;i<n;i++){
                TreeNode cur=q.poll();
                if (cur.left!=null){
                    q.add(cur.left);
                    sum+=cur.left.val;
                }
                if (cur.right!=null){
                    q.add(cur.right);
                    sum+=cur.right.val;
                }
            }
            if (sum!=0) pq.add(sum);
            
        }
        if (k>level-1) return -1;
        long res=-1;
        for (int i=0;i<k;i++){
            if (!pq.isEmpty()) res=pq.poll();
        }
        return res;
    }
}