class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> st=new Stack<>();
    int l=temperatures.length;
    int[] ans=new int[l];
    ans[l-1]=0;
    st.push(l-1);
    for (int i=l-2;i>=0;i--){
        if (temperatures[st.peek()]>temperatures[i]){
                   ans[i]=st.peek()-i;
                   st.push(i);                  
                   continue;
        }
        while (!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
            st.pop();
        }
        if (!st.isEmpty() && temperatures[st.peek()]>temperatures[i]){
            ans[i]=st.peek()-i;
            st.push(i);
        }
        else st.push(i);
    }
    return ans;
        
    }
}