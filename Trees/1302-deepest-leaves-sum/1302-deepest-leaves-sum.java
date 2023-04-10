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
    public int deepestLeavesSum(TreeNode root) {
        List<List<Integer>> level=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<Integer> cur=new ArrayList<>();
        cur.add(root.val);
        level.add(cur);
        while (!q.isEmpty()){
            ArrayList<Integer> curArr=new ArrayList<>();
            int len=q.size();
            for (int i=0;i<len;i++){
                TreeNode top=q.poll();
                if (top.left!=null){
                    q.add(top.left);
                    curArr.add(top.left.val);
                }
                if (top.right!=null){
                    q.add(top.right);
                    curArr.add(top.right.val);
                }
                
            }
            if (curArr.size()!=0) level.add(curArr);
        }
        int n=level.size()-1;
        int res=0;
        List<Integer> last=level.get(n);
        for (int i=0;i<last.size();i++){
            res+=last.get(i);
        }
        return res;
        
    }
  
}