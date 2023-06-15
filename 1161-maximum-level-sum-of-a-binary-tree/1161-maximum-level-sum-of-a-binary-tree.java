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
    public int maxLevelSum(TreeNode root) {
			Queue<TreeNode> q=new LinkedList<>();
            q.add(root);
			HashMap<Integer,Integer> map=new HashMap<>();
             int level=1;
             map.put(level,root.val);
			while (!q.isEmpty()){
				int sum=0;
				level++;
                int n=q.size();
				for (int i=0;i<n;i++){
					TreeNode cur=q.poll();

					if (cur.left!=null){
						q.add(cur.left);
						sum+=cur.left.val;
					}
					if (cur.right!=null){
						q.add(cur.right);
						sum+=cur.right.val;
					}

				}
                if (sum!=0) map.put(level,sum);
			}  
            int res=-1;
            int maxValue=Integer.MIN_VALUE;
            for (Map.Entry<Integer,Integer> entry:map.entrySet()){
                if (entry.getValue()>maxValue){
                    maxValue=entry.getValue();
                    res=entry.getKey();
                }
            }
            return res;
    }
}