/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    ArrayList<TreeNode> res=new ArrayList<>();
    public boolean isSubPath(ListNode head, TreeNode root) {
        getNodes(head,root);
        // System.out.println(res);
        for (TreeNode node:res){
            if (isPath(head,node)) return true;
        }
        return false;
    }
    
   boolean isPath(ListNode head,TreeNode root){
        if (head==null) return true;
        if(root==null) return false;
        
        if (head.val==root.val){
            return (isPath(head.next,root.left) || isPath(head.next,root.right));
        }
        return false;
    }
    void getNodes(ListNode head,TreeNode root){
        if (head==null | root==null) return;
        if (head.val==root.val){
            res.add(root);
        }
        getNodes(head,root.left);
        getNodes(head,root.right);
    }
}