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
        // ArrayList<ArrayList<Integer>> l1=

        // ArrayList<ArrayList<Integer>> l2=;
        ArrayList<Integer> res=new ArrayList<>();

        ArrayList<Integer> res2=new ArrayList<>();

        dfs(root1,res);
        dfs(root2,res2);
    
    

        return (res).equals(res2);

        
        
    }

    void dfs(TreeNode root,ArrayList<Integer> res){
        if (root==null) return;
        if (root.left==null && root.right==null) res.add(root.val);
        dfs(root.left,res);
        dfs(root.right,res);
        
    }
}