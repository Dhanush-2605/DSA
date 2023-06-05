class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> arr=new ArrayList<>();
        for (int i=1;i<=n;i++){
            arr.add(i);
        }
        return helper(arr,k,0);
        
    }
    int helper(List<Integer> arr,int k,int i){
        if (arr.size()==1) return arr.get(0);
        i=(i+k-1)%arr.size();
        arr.remove(i);
        return helper(arr,k,i);
    }
}