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
    public TreeNode sortedArrayToBST(int[] nums) {
       return recurse(0,nums.length-1,nums);
        
        
        
    }
    TreeNode recurse(int s,int e,int[] nums){
        if (s>e) return null;
        int mid=s+(e-s)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=recurse(s,mid-1,nums);
        root.right=recurse(mid+1,e,nums);
        return root;
    }
}