class Solution {
    public int largestRectangleArea(int[] heights) {
        int len=heights.length;
        int[] l=new int[len];
        int[] r=new int[len];
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<len;i++){
            while (!stack.isEmpty() && heights[stack.peek()]>=heights[i]) stack.pop();
            if (stack.isEmpty()) l[i]=0;
            else l[i]=stack.peek()+1;
            stack.push(i);
        }
        while (!stack.isEmpty()) stack.pop();
        for (int i=len-1;i>=0;i--){
            while (!stack.isEmpty() && heights[stack.peek()]>=heights[i]) stack.pop();
            if (stack.isEmpty()) r[i]=len-1;
            else r[i]=stack.peek()-1;
            stack.push(i);
        }
        int max=0;
        for (int i=0;i<len;i++){
            int area=heights[i]*(r[i]-l[i]+1);
            max=Math.max(max,area);
        }
        return max;
    }
}