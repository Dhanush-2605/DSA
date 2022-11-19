import java.util.*;

//  REFER LEETCODE
// Link -> https://leetcode.com/problems/binary-tree-preorder-traversal/

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

class PreOrder{
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> li=new ArrayList<Integer>();
        TreeNode curr=root;
        while (curr!=null){
            if (curr.left==null){
                // sum=(sum<<1)+curr.val;
                li.add(curr.val);
                curr=curr.right;
            }else{
                TreeNode prev=curr.left;
                while (prev.right!=null && prev.right!=curr){
                    prev=prev.right;
                    
                }
                if (prev.right==null){
                     // sum=(sum<<1)+curr.val;
                    li.add(curr.val);
                    prev.right=curr;
                   
                    curr=curr.left;
                    
                }else{
                    prev.right=null;
                    
                    curr=curr.right;
                    
                }
            }
                
            
        }
        return li;
        
    }
}