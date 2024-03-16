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
    public TreeNode searchBST(TreeNode root, int val) {
       

        return inorder(root,val);
        // return res;
    }
    static TreeNode inorder(TreeNode root,int key){
    if (root==null) return null;
     if (root.val==key){
           return root;
    }
   if (root.val>key) return inorder(root.left,key);
    else return inorder(root.right,key);
    // return;

    
}
}