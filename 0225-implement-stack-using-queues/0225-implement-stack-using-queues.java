class MyStack {
private Queue<Integer> q = new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        int start = 0;
        int stop = q.size()-1;
        while(start<stop)
        {
            q.add(q.poll());
            start++;
        }
        
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
       return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */