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
  

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
  List<Integer> temp1=new ArrayList<>();
  DFS(root1,temp1);
    List<Integer> temp2=new ArrayList<>();
    DFS(root2,temp2);
    return temp1.equals(temp2);
        
    }
    void DFS(TreeNode node, List<Integer> temp){
        if (node==null) return;
        if (node.left==null && node.right==null){
            temp.add(node.val);
        }
        DFS(node.left,temp);
        DFS(node.right,temp);
        return;

    }
}