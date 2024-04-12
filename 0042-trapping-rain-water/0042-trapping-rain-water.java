class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        prefix[0]=height[0];
        suffix[n-1]=height[n-1];
        int max=height[0];
        for (int i=1;i<n;i++){
            max=Math.max(height[i],max);
            prefix[i]=max;
            
        }
        max=height[n-1];
        for (int i=n-1;i>=0;i--){
            max=Math.max(max,height[i]);
            suffix[i]=max;
        }
        // System.out.println(Arrays.toString(prefix));
        // System.out.println(Arrays.toString(suffix));
        int res=0;
        for (int i=1;i<n-1;i++){
            int temp=(Math.min(prefix[i],suffix[i]))-height[i];
            // System.out.println(temp);
            res+=temp;
            
        }
        return res;
    }
}