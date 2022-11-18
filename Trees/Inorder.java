//REFER LEETCODE

// Link -> https://leetcode.com/problems/binary-tree-inorder-traversal/
import java.util.*;

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
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null){
            List<Integer> res=new ArrayList<Integer>();
         
            return res;
        }
         List<Integer> arr=new ArrayList<Integer>();
        
        arr.addAll(inorderTraversal(root.left));
        arr.add(root.val);
        arr.addAll(inorderTraversal(root.right));
        
        
        return arr;
        
    }
}