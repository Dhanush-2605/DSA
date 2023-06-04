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
    List<Integer> res=new ArrayList<>();
    public int countNodes(TreeNode root) {
        inorder(root);
        return res.size();
        
    }
    
    void inorder(TreeNode root){
        if (root==null) return;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
        
        
    }
}