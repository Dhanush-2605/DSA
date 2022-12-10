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
    int summ=0;
    public int sumOfLeftLeaves(TreeNode root) {   
      
        recurse(root);
        return summ;
        
    }
    void recurse(TreeNode root){
        if (root==null || (root.left==null && root.right==null)) return;
        if (root.left!=null){
        if (root.left.left==null && root.left.right==null) summ+=root.left.val;
        }
        recurse(root.left);
        recurse(root.right);
    }
}