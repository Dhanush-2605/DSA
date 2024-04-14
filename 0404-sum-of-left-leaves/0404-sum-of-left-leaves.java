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
    public int sumOfLeftLeaves(TreeNode root) {
        int[] res={0};
        recurse(root,false,res);
        return res[0];
        
    }
    void recurse(TreeNode root,boolean isLeft,int[] res){
        if (root==null) return;
        if (root.left==null && root.right==null && isLeft){
            res[0]+=root.val;
            // System.out.println(res);
        }
        recurse(root.left,true,res);
        recurse(root.right,false,res);
    }

}