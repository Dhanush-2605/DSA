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
class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode _node,int _num){
        this.node=_node;
        this.num=_num;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
     
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        int width=0;
           while (!q.isEmpty()){       
               int s=q.peek().num;
                int len=q.size();  
               
               for (int i=0;i<len;i++){
                    TreeNode cur=q.peek().node;
                    int curNum=q.peek().num;
                    q.poll();
                   if (cur.left!=null){
                       q.add(new Pair(cur.left,2*curNum));
                       
                   }
                   if (cur.right!=null){
                       q.add(new Pair(cur.right,2*curNum+1));
                   }
                   width=Math.max(width,curNum-s+1);
                   
               }
               

    }
                      return width;

}
}