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
    public boolean isEvenOddTree(TreeNode root) {
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
        if (list.size()>=1){
            int val=list.get(0).get(0);
            if (val%2==0) return false;
        }
        for (int i=1;i<list.size();i++){
            ArrayList<Integer> temp=list.get(i);
            if (i%2==0){
                if (temp.size()==1){
                    if (temp.get(0)%2==0) return false;
                }
                for (int j=0;j<temp.size()-1;j++){
                    int n1=temp.get(j);
                    int n2=temp.get(j+1);
                    // System.out.println(n2+" "+n2);
                    if (n1%2==0 || n2%2==0) return false;
                    else if (n1>=n2) return false;
                    
                    
                }
            }
            else{
                if (temp.size()==1){
                    if (temp.get(0)%2!=0) return false;
                }
                 for (int k=0;k<temp.size()-1;k++){
                    int n1=temp.get(k);
                    int n2=temp.get(k+1);
                    if (n1%2!=0 || n2%2!=0) return false;
                    else if (n2>=n1) return false;
                    
                    
                }
                
            }
            

        }
      return true;
                
    }
}