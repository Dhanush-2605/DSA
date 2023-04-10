
//Refer Leetcode
// Link -> https://leetcode.com/problems/binary-tree-postorder-traversal/

import java.util.*;
public class PostOrder {
    public static void main(String[] args) {
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> res=new ArrayList<>();
            recurse(res,root);
            return res;
            
            
            
        }
    }
    void recurse(List<Integer> res,TreeNode root){
        if (root==null) return;
        recurse(res,root.left);
        recurse(res,root.right);
        res.add(root.val);
    }
}
