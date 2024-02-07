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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
               int ans=Integer.MAX_VALUE;

        recurse(root,list);
        for (int i=0;i<list.size()-1;i++){
            ans=Math.min(list.get(i+1)-list.get(i),ans);
        }
        
        return ans;
    }
    void recurse(TreeNode root,ArrayList<Integer> list){
        if (root==null) return;
     
        recurse(root.left,list);
        list.add(root.val);
        recurse(root.right,list);
    }
}