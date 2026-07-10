class MyQueue {
    Stack<Integer> s = new Stack<>();
    Stack<Integer> ts = new Stack<>();
    
    public void push(int x) {
        s.push(x);
    }
    
    public int pop() {
        if(ts.isEmpty()){
            while(!s.isEmpty()){
                ts.push(s.pop());
            }
        }
        return ts.pop();
    }
    
    public int peek() {
        if(ts.isEmpty()){
            while(!s.isEmpty()){
                ts.push(s.pop());
            }
        }
        return ts.peek();
    }
    
    public boolean empty() {
        return s.isEmpty()&&ts.isEmpty();
    }
}