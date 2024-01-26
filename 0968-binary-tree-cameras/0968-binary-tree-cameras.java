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
    int moniter=-1;
    int needCam=0;
    int hasCam=1;
    int cam;
    public int minCameraCover(TreeNode root) {
        cam=0;
    
        int ans=Dfs(root);
        if (ans==needCam) return cam+1;
        
        return cam;
        
        
    }
    int Dfs(TreeNode root){
        if (root==null) return moniter;
        
        int left=Dfs(root.left);
        int right=Dfs(root.right);
        if (left==needCam || right==needCam){
            cam++;
            return hasCam;
        }
        if (left==hasCam || right==hasCam) return moniter;
        return needCam;

    }
}