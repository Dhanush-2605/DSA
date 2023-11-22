class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int r=nums.size();
        int c=nums.get(0).size();
        for (int i=r-1;i>=0;i--){
            // int size=nums.get(i).size();
            for (int j=nums.get(i).size()-1;j>=0;j--){
                int sum=i+j;
                if (!map.containsKey(sum)){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums.get(i).get(j));
                    map.put(sum,temp);
                }
                else {
                     map.get(sum).add(nums.get(i).get(j));
                }
            }
        }
            for (int i=0;i<200000;i++){
                List<Integer> temp=map.getOrDefault(i,new ArrayList<>());
                if (temp.size()==0) break;
                res.addAll(temp);
            }
        int[] ans=new int[res.size()];
        for (int i=0;i<ans.length;i++) ans[i]=res.get(i);
      
        return ans;
        
    }
}