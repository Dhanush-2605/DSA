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
    boolean ans=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return recurse(p,q);
    }
    boolean recurse(TreeNode p,TreeNode q){
        if (p==null && q==null) return true;
        if (p==null && q!=null){
           return false; 
        }
        if (p!=null && q==null) return false;
        if (p.val!=q.val) return false;

        boolean l=recurse(p.left,q.left);
        boolean r=recurse(p.right,q.right);
        return (l && r);
    }
}