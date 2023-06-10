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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        int level=0;
        Queue<TreeNode> q=new LinkedList<>();        
        List<Integer> li=new ArrayList<Integer>();
        q.add(root); 
        
        TreeNode r=q.peek();
       
        li.add(r.val);
        if (depth==1) {
            TreeNode cur=new TreeNode(val);
            cur.left=root;
            return cur;
        }
            
        while (!q.isEmpty()){
           List<Integer> l=new ArrayList<Integer>();            
            int len=q.size();
            level++;
            if (depth-1==level){
           
            for(int i=0;i<len;i++){
                
                TreeNode cur=q.poll();
                
                    TreeNode n1=new TreeNode(val);               
                    TreeNode n2=new TreeNode(val); 
                    n1.left=cur.left;
                    cur.left=n1;
                    n2.right=cur.right;
                     cur.right=n2;
                
            }
                
                return root;
            }
     
            
            for(int i=0;i<len;i++){
                TreeNode cur=q.poll();
                if (cur.left!=null){
                q.add(cur.left);                
                l.add(cur.left.val);
               
              
            }
            if (cur.right!=null){
                q.add(cur.right);
                 l.add(cur.right.val);
                
            }
                
            }


        }
        return root;
    }
}