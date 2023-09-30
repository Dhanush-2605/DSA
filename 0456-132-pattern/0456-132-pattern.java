class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int len=nums.length;
        int k=-1;
        for (int i=len-1;i>=0;i--){
            int n=nums[i];
            if (k>-1 && nums[k]>nums[i]) return true;
                   
            while (!st.isEmpty() && n>nums[st.peek()]){
                k=st.pop();
            }
    
            st.push(i);
        }
        return false;
        
    }
}