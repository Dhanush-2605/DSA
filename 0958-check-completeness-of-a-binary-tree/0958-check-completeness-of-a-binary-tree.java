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
    public boolean isCompleteTree(TreeNode root) {
        List<boolean[]> level=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean[] top=new boolean[1];
        top[0]=true;
        level.add(top);             
         while (!q.isEmpty()){       
                     
             int len=q.size();            
                TreeNode cur=q.poll();
                if(cur!=null){
                   q.add(cur.left);  
                   q.add(cur.right);
                }
                else{
                    while (!q.isEmpty()){
                        if (q.poll()!=null) return false;
                    }
                }
 
               
              
      
              
                
            }

   
             
        
   

        return true;
        
        
        
    }
}





