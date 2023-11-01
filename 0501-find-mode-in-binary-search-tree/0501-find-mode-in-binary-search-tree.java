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
        Integer prev=null;
        int max=0;
        int ctn=1;

    public int[] findMode(TreeNode root) {
        List<Integer> temp=new ArrayList<>();
        recurse(root,temp);
                int[] res=new int[temp.size()];

        int ind=0;
  for (int i=0;i<temp.size();i++){
      res[i]=temp.get(i);
  }
        return res;
        
    }
    void recurse(TreeNode root,List<Integer> temp){
        if (root==null) return;
        recurse(root.left,temp);
        
        if (prev!=null){
            if (root.val==prev) ctn++;
            else ctn=1;
        }
        
        if (ctn>max){
            max=ctn;
            prev=root.val;
            temp.clear();
            temp.add(root.val);
        }
        else if (ctn==max) temp.add(root.val);
        
        prev=root.val;        
        recurse(root.right,temp);
    }

}