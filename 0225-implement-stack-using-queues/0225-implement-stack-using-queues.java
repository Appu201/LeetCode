class MyStack {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        q.offer(x);
        for(int i=0; i<q.size()-1; i++){
            q.offer(q.poll());
        }
    }

    int pop() {
        return q.poll();
    }

    int top() {
        return q.peek();
    }

    boolean empty() {
        return q.isEmpty();
    }
}