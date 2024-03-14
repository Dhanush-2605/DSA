class Solution {

    public List<String> generateParenthesis(int n) {
       List<String> res=new ArrayList<>();
       char[] arr=new char[2*n];
       backtrack(res,arr,0,0,0,n);
       return res;

    }
    void backtrack(List<String> res,char[] arr,int i,int o,int c,int n){
       
        if (o==n && c==n){
            String s=new String(arr);
            res.add(s);
            return;

        }
        if (o<n){
            arr[i]='(';
            backtrack(res,arr,i+1,o+1,c,n);
        }
        if (o>c){
            arr[i]=')';
            backtrack(res,arr,i+1,o,c+1,n);
        }

    }
}