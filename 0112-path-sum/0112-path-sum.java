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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root,0,targetSum);
        
    }
    boolean helper(TreeNode root,int curSum,int targetSum){
        if (root==null) return false;
        curSum+=root.val;
        if (curSum==targetSum && root.left==null && root.right==null) return true;
        boolean left=helper(root.left,curSum,targetSum);
        boolean right=helper(root.right,curSum,targetSum);
        return (left||right);
            
        
    }
}