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
    public TreeNode balanceBST(TreeNode root) {
        TreeNode cur=root;
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(arr,cur);
        Collections.sort(arr);
        return createNewTree(0,arr.size()-1,arr);
        
    }
    TreeNode createNewTree(int s,int e,ArrayList<Integer> arr){
        if (s>e) return null;
        int mid=s+(e-s)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=createNewTree(s,mid-1,arr);
        root.right=createNewTree(mid+1,e,arr);
        return root;
    }
    void inorder(ArrayList<Integer> arr,TreeNode root){
        if (root==null) return;
        inorder(arr,root.left);
        arr.add(root.val);
        inorder(arr,root.right);
        
      
    }
}