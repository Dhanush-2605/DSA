// Link -> https://leetcode.com/problems/binary-tree-level-order-traversal/

import java.util.*;


// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
class BFS{
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        
        List<Integer> li=new ArrayList<Integer>();
        q.add(root);
        if(root==null){
            return res;
        }
        
        TreeNode r=q.peek();
       
        li.add(r.val);
       res.add(li);
            
        

       
        
      
        // res.add(root.val);
        while (!q.isEmpty()){
            List<Integer> l=new ArrayList<Integer>();
            
            int len=q.size();
            
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

            if (!l.isEmpty()){
                 res.add(l);
                
            }
             
        }
        return res;
        
    }
}