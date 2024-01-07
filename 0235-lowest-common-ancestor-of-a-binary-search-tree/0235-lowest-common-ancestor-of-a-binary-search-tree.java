/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
            TreeNode res=null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        recurse(root,p.val,q.val);
        return res;
        
    }
    void recurse(TreeNode root,int p,int q){
        if (root==null) return;
        
        
        if (p>root.val && q>root.val){
            recurse(root.right,p,q);
        }
        else if (p<root.val && q<root.val){
            recurse(root.left,p,q);
        }
        else {
            res=root;
        }
        return;
    
    }
}