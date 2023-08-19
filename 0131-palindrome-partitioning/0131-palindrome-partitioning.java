class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> path=new ArrayList<>();
        recurse(0,res,path,s.length(),s);
        return res;
        
        
    }
    
    void recurse(int i,List<List<String>> res,List<String> path,int n,String s){
        if (i>=n){
            res.add(new ArrayList<>(path));
            return;
            
        }
        for (int j=i;j<n;j++){
            if (isPalindrome(s.substring(i,j+1))){
                path.add(s.substring(i,j+1));
                recurse(j+1,res,path,n,s);
                path.remove(path.size()-1);
            }
        }
        
    }
    boolean isPalindrome(String s){
        int r=0;
        int e=s.length()-1;
        while (e>=r){
            if (s.charAt(r)!=s.charAt(e)){
                return false;
            }
            r++;
            e--;
        }
        return true;
    }
}