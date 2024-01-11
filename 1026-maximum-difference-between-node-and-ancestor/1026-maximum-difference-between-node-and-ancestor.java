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
            HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();

    public int maxAncestorDiff(TreeNode root) {
        recurse(root);
        int res=0;
        for (Map.Entry<Integer,ArrayList<Integer>> entry:map.entrySet()){
            int key=entry.getKey();
            ArrayList<Integer> cur=entry.getValue();
            for (int val:cur){
                res=Math.max(res,(int)Math.abs(key-val));
            }
        }
        return res;
        
    }
    void recurse(TreeNode root){
        if (root==null) return;
        if (root.left!=null){
            int key=root.left.val;
            ArrayList<Integer> cur=map.getOrDefault(root.val,new ArrayList<Integer>());
            map.put(key,new ArrayList<Integer>());
            map.get(key).add(root.val);
            map.get(key).addAll(cur);
            recurse(root.left);

            
        }
       
        if (root.right!=null){
            int key=root.right.val;
           ArrayList<Integer> cur=map.getOrDefault(root.val,new ArrayList<Integer>());
            map.put(key,new ArrayList<Integer>());
            map.get(key).add(root.val);
            map.get(key).addAll(cur);
            recurse(root.right);
            
        }
        return;
    }
}