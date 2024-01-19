class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st=new Stack<>();
        minSt=new Stack<>();
        
    }
    
    public void push(int val) {
        st.push(val);
        int minVal=Integer.MAX_VALUE;
        if (minSt.isEmpty()) {
            minSt.push(val);
            // minVal=Math.min(minVal,val);
        }
        else{
            if (val<=minSt.peek()){

                  minSt.push(val);
            }
            minVal=Math.min(minVal,minSt.peek());

        }
        if (st.size()!=minSt.size()) minSt.push(minVal);
   
    
        
        
    }
    
    public void pop() {
       
        minSt.pop();
        st.pop();
        
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minSt.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */