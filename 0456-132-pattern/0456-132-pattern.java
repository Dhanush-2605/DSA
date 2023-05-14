class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int k=-1;
        for (int i=n-1;i>=0;i--){
            if (k>-1 && nums[k]>nums[i]) return true;            
            while (!st.isEmpty() && nums[i]>nums[st.peek()]){
                k=st.pop();
            }
            st.push(i);
            
        }

        return false;
        
    }
}