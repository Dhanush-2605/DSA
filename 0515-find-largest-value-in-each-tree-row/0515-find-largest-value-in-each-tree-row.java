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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        ArrayList<Integer> res=new ArrayList<>();
                if (root==null) return res;

        q.add(root);
        res.add(root.val);
        while (!q.isEmpty()){
            
            ArrayList<Integer> curList=new ArrayList<>();
            int len=q.size();
            for (int i=0;i<len;i++){
                TreeNode cur=q.poll();

                if (cur.left!=null){
                    curList.add(cur.left.val);
                    q.add(cur.left);
                }
                if (cur.right!=null){
                    curList.add(cur.right.val);
                    q.add(cur.right);
                }
            }
            if (!curList.isEmpty()) res.add(getMax(curList));


        }
        return res;
        
    }
    int getMax(ArrayList<Integer> l){
        double max=-Math.pow(2,32);
        for (int i=0;i<l.size();i++){
            if (l.get(i)>max) max=l.get(i);
        }
        return (int)max;
    }
}