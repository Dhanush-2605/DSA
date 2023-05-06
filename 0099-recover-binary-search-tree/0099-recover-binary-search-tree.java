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
    int ind=0;
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        Collections.sort(arr);
        traverse(root,arr);
    }
    void inorder(TreeNode root,ArrayList<Integer> arr){
        if (root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    void traverse(TreeNode root,ArrayList<Integer> arr){
        if (root==null) return;
        traverse(root.left,arr);
        if (root.val!=arr.get(ind)) root.val=arr.get(ind);
        ind++;
        traverse(root.right,arr);
    }
}