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
    public int findBottomLeftValue(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        arr.add(root.val);
        list.add(arr);
        while (!q.isEmpty()){
            int len=list.get(list.size()-1).size();
            ArrayList<Integer> temp=new ArrayList<>();
            for (int i=0;i<len;i++){
                TreeNode cur=q.poll();
                if (cur.left!=null){
                    temp.add(cur.left.val);
                    q.add(cur.left);
                }
                if (cur.right!=null){
                    temp.add(cur.right.val);
                    q.add(cur.right);
                }                               

                
            }
            if (temp.size()!=0) list.add(temp);
            
        }
        ArrayList<Integer> ans=list.get(list.size()-1);
        return ans.get(0);
        
    }
}