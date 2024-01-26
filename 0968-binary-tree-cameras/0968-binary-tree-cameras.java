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
    int cam;
    Set<TreeNode> set;
    public int minCameraCover(TreeNode root) {
        cam=0;
        set=new HashSet<>();
        set.add(null);
        Dfs(root,null);
        return cam;
        
        
    }
    void Dfs(TreeNode root,TreeNode parent){
        if (root!=null){
            
            Dfs(root.left,root);
            Dfs(root.right,root);
            // System.out.println(parent.val);
            if (parent==null && !set.contains(root) || !set.contains(root.left) || !set.contains(root.right)){
                cam++;
                set.add(root);
                set.add(root.left);
                set.add(root.right);
                set.add(parent);
            }
        }
    }
}