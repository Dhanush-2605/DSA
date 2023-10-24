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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if (root==null) return res;
        q.add(root);
        res.add(root.val);
        while (!q.isEmpty()){
            int ans=Integer.MIN_VALUE;
            int len=q.size();
            int ctn=0;
            for (int i=0;i<len;i++){
                TreeNode temp=q.poll();

                if (temp.left!=null){
                    q.add(temp.left);
                    ans=Math.max(ans,temp.left.val);
                    ctn++;
            }
              if (temp.right!=null){
                  q.add(temp.right);
                  ans=Math.max(ans,temp.right.val);
                  ctn++;
            }
         }
            if (ctn!=0) res.add(ans);
        }
        return res;
        
    }
}