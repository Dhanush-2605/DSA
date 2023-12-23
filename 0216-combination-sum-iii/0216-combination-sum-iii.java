class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<Integer> temp=new ArrayList<>();
        recurse(temp,n,k,1);
        return res;
    }
    void recurse(List<Integer> temp,int n,int k,int s){
        if (temp.size()==k){
            if (n==0){
            List<Integer> cur=new ArrayList<>(temp);
            // System.out.println(cur);
            res.add(cur);
            }
            return;
        }
        if (n<0 || k<0) return;
        
        for (int i=s;i<=9;i++){
            temp.add(i);
            recurse(temp,n-i,k,i+1);
            temp.remove(temp.size()-1);
        }
        return;
        
    }
}