class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> f1=new ArrayList<>();
        f1.add(1);
        res.add(f1);
        for (int i=1;i<=rowIndex;i++){
            List<Integer> cur=res.get(i-1);
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for (int j=0;j<cur.size()-1;j++){
                temp.add(cur.get(j)+cur.get(j+1));
            }
            temp.add(1);
            res.add(temp);
        }
        return res.get(rowIndex);
    }
}