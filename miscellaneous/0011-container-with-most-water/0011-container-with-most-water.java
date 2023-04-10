class Solution {
    public int maxArea(int[] height) {
        int len=height.length;
        int s=0;
        int e=len-1;
        int res=Integer.MIN_VALUE;
        while (e>s){
            int b=e-s;
            int h=Math.min(height[s],height[e]);
            if (h==height[s]) s++;
            if (h==height[e]) e--;
            res=Math.max(res,b*h);
            
        }
        return res;
    }
}