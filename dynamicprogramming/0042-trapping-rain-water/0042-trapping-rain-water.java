class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        int pMax=0;
        int sMax=0;
        for (int i=0;i<n;i++){
            pMax=Math.max(pMax,height[i]);
            prefix[i]=pMax;            
        }
        for (int i=n-1;i>=0;i--){
            sMax=Math.max(sMax,height[i]);
            suffix[i]=sMax;            
        }
        int res=0;
        for (int i=0;i<n;i++){
            
            res+=(Math.min(suffix[i],prefix[i])-height[i]);
            
        }
       

        return res;
        
    }
}