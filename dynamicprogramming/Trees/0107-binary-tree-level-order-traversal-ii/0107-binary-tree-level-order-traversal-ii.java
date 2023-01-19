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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        ArrayList<Integer> curRoot=new ArrayList<>();
        if (root==null) return res;
        curRoot.add(root.val);
        res.add(curRoot);
        while (!q.isEmpty()){
            int len=q.size();
            ArrayList<Integer> curArr=new ArrayList<>();
            for (int i=0;i<len;i++){
                TreeNode cur=q.poll();
                if (cur.left!=null){
                    curArr.add(cur.left.val);
                    q.add(cur.left);
                    
                }
                if (cur.right!=null){
                    curArr.add(cur.right.val);
                    q.add(cur.right);
                    
                }

            }
                            if (curArr.size()!=0) res.add(curArr);

        }
        Collections.reverse(res);
        return res;
        
        
    }
}