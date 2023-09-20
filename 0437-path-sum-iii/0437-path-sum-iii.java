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
    int ctn=0;
    public int pathSum(TreeNode root, int targetSum) {
        int c=0;
       
        HashMap<Long,Integer> map=new HashMap<>();
        map.put(0L,1);
        helper(root,0,c,targetSum,map);
        return ctn;
    }
    void helper(TreeNode root,long sum,int c,int target,
                HashMap<Long,Integer> map){
        if (root==null) return;
        sum=sum+root.val;
        if (map.containsKey(sum-target)) ctn+=map.get(sum-target);
        map.put(sum,map.getOrDefault(sum,0)+1);
        
    
        helper(root.left,sum,c,target,map);
        helper(root.right,sum,c,target,map);
        map.put(sum,map.get(sum)-1);
    
    }

}