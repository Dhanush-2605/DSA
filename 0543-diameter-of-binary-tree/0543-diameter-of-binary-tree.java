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
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        int l=recurse(root);
      
        return res;
      
    }
    int recurse(TreeNode root){
        if (root==null) return 0;
        int left=recurse(root.left);
        int right=recurse(root.right);
        res=Math.max(res,left+right);
        return 1+Math.max(left,right);
        
    }
}