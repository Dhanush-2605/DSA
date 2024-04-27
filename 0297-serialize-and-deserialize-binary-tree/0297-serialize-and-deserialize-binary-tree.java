/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        ArrayList<String> arr= new ArrayList<String>();
          Dfs(root,arr);
          String s=String.join(",",arr);
           return s;        
}
    
          void Dfs(TreeNode root,ArrayList<String> arr){
              if (root==null){
                  arr.add("N");
                 
                  return;
              }
              arr.add(String.valueOf(root.val));
              Dfs(root.left, arr);              
              Dfs(root.right, arr);
              
          }
    // Decodes your encoded data to tree.
 
    public TreeNode deserialize(String data) {
        String[] str=data.split(",");
        return Dfs(str);  
           
        
    }

 int i=0;
TreeNode Dfs(String[] str){
    if (str[i].equals("N")){
        i+=1;
        return null;
    }
    int num=Integer.parseInt(str[i]);
    TreeNode cur=new TreeNode(num);
    i+=1;
    cur.left=Dfs(str);
    cur.right=Dfs(str);
    return cur;
    
 
            
}
}
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));