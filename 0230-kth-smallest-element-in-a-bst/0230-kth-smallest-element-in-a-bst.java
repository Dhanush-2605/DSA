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
      static int ans=-1;
      static int K=0;
    public int kthSmallest(TreeNode root, int k) {
           K=k;
          inorder(root);
          return ans;  
    }
    static void inorder(TreeNode root){
        if (root==null) return;
        inorder(root.left);
        K--;
        if (K==0) ans=root.val;   
        inorder(root.right);
    
        
    }
}