class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[] res=new int[col];
        int ind=0;
        int count=0;
        int ans=0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){

                if (matrix[i][j]-'0'==0) res[ind]=0;
                else res[ind]=(matrix[i][j]-'0') + res[ind];
                ind++;


            }
            ans=Math.max(maxArea(res),ans);
            ind=0;
        }
        return ans;
    }
    int maxArea(int[] heights){
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