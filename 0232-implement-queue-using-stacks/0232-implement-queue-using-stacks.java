class MyQueue {
    int pos ;
    int mpos;
    Stack<Integer> st;
    public MyQueue() {
        pos = -1;
        mpos = -1;
        st = new Stack<Integer>();
    }
    
    public void push(int x) {
        st.add(x);
        mpos++;
        if(pos == -1)
            pos++;
    }
    
    public int pop() {
        return st.get(pos++);
    }
    
    public int peek() {
        // if(pos == -1)
        return st.get(pos);
    }
    
    public boolean empty() {
        if(mpos<pos || pos == -1)
            return true;
        return false;
        // return st.empty();
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
//nb=