class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        for (int i=0;i<=n;i++){
            int cur=i;
            int ctn=0;
            while (cur!=0){
                ctn+=(cur&1);
                cur>>=1;                
            }
            res[i]=ctn;
        }
        return res;
        
    }
}