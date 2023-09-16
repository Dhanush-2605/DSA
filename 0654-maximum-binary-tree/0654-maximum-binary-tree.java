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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
      return recurse(nums,0,nums.length-1);
        
        
    }

    TreeNode recurse(int[] nums,int s,int e){
        if (s>e) return null;
        
        int value=getInd(nums,s,e);
        TreeNode root=new TreeNode(nums[value]);
        root.left=recurse(nums,s,value-1);
        root.right=recurse(nums,value+1,e);
        return root;
        
    }
    int getInd(int[] nums,int s,int e){
        int max=-1;
        int ind=0;
        int n=nums.length;
        for (int i=s;i<=e;i++){
            int cur=nums[i];
            if (cur>=max){
                max=cur;
                ind=i;
            }
        }
        return ind;
    }
}