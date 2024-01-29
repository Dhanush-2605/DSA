class MyQueue {
    Stack<Integer> st;
    Stack<Integer> q;

    public MyQueue() {
        st=new Stack<>();
        q=new Stack<>();
        
    }
    
    public void push(int x) {
        st.push(x);
        
    }
    
    public int pop() {
        while (!st.isEmpty()){
            q.push(st.pop());            
            
        }
        int ans=q.pop();
        while (!q.isEmpty()){
            st.push(q.pop());
            
        }
        return ans;
   
        
    }
    
public int peek() {
      while (!st.isEmpty()){
            q.push(st.pop());            
            
        }
        int ans=q.peek();
        while (!q.isEmpty()){
            st.push(q.pop());
            
        }
        return ans;
        
    }
    
    public boolean empty() {
        
        return st.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */