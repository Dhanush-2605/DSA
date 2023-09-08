class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> one=new ArrayList<>();
        one.add(1);
        List<Integer> two=new ArrayList<>();
        two.add(1);
        two.add(1);
        res.add(one);
        if (numRows==1) return res;
        res.add(two);

        int rem=numRows;
        for (int i=2;i<rem;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            List<Integer> prev=res.get(i-1);
            for (int j=0;j<prev.size()-1;j++){
                temp.add(prev.get(j)+prev.get(j+1));
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }
}