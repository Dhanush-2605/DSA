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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        helper(root,targetSum,res,temp,0);
        return res;
        
            
    }
    void helper(TreeNode root,int target,List<List<Integer>> res,List<Integer> cur,int curSum){
        if (root==null) return;
        curSum+=root.val;
        cur.add(root.val);
        if (curSum==target && root.left==null && root.right==null){
            ArrayList<Integer> c=new ArrayList<>(cur);
            res.add(c);
        }
        helper(root.left,target,res,cur,curSum);
        helper(root.right,target,res,cur,curSum);
        cur.remove(cur.size()-1);
        
        
    }
    
}