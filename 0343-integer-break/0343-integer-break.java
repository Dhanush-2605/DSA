class Solution {
    public int integerBreak(int n) {
        if (n==2 || n==3)return n-1;
        return recurse(n-1,n);
        
    }
    int recurse(int ind,int target){
        if (target==0) return 0;
        if (ind==1){
            if (target>=ind) return target;
        }
        int unTake=recurse(ind-1,target);
        int take=0;
        if(target>=ind) take=ind*recurse(ind,target-ind);
        return Math.max(take,unTake);
        
    }
}