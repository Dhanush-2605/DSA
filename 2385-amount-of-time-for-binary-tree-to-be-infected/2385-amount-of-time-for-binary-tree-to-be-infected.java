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

    public int amountOfTime(TreeNode root, int start) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
         List<List<Integer>> adj=new ArrayList<>();
        recurse(root,map);
         return bfs(start,adj,map)-1;
        
    }
      static int bfs(int startVertex,List<List<Integer>> adj,HashMap<Integer,List<Integer>> map) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(startVertex);
        visited.add(startVertex);
        int ctn=0;
        while (!queue.isEmpty()) {
         
            ctn++;
            int len=queue.size();
            for (int i=0;i<len;i++){
                  int currentVertex = queue.poll();


            for (int neighbor : map.getOrDefault(currentVertex, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                    // temp.add(neighbor);
                }
               
            }
        }
            
         
        }
          return ctn;
    }
    
    void recurse(TreeNode root,HashMap<Integer,List<Integer>> map){
        if (root==null) return;
         if (!map.containsKey(root.val)) map.put(root.val,new ArrayList<>());
        if (root.left!=null){
            if (!map.containsKey(root.left.val)){
                map.put(root.left.val,new ArrayList<>());
            } 
            map.get(root.left.val).add(root.val);
            map.get(root.val).add(root.left.val);            
        }
        if (root.right!=null){
          if (!map.containsKey(root.right.val)){
                map.put(root.right.val,new ArrayList<>());
            } 
            map.get(root.right.val).add(root.val);
            map.get(root.val).add(root.right.val);          
        }
        recurse(root.left,map);
        recurse(root.right,map);
        return;
        
    }
}