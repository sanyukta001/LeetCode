class Pair{
    int data;
    int min;
    Pair(int _val, int _min){
        data = _val;
        min = _min;
    }
}
class MinStack {
    Stack<Pair> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.add(new Pair(val,val));
        }
        else{
            if(stack.peek().min > val){
                stack.add(new Pair(val,val));
            }
            else stack.add(new Pair(val,stack.peek().min));
        }
    }
    
    public void pop() {
        if(!stack.isEmpty())stack.pop();
    }
    
    public int top() {
        return stack.peek().data;
    }
    
    public int getMin() {
        if(stack.isEmpty()) return 0;
        else return stack.peek().min;
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