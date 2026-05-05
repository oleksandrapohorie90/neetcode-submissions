class MyStack {
    //queue can be implemented with LinkedList
    //same as minStack
    //OR
    //with 1 queue
    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        //add from right
        //remove from left - FIFO
        /**
        You add the new element to the back of the queue, like normal.
        Let’s say q = [1, 2], and now we call push(3).
        After offer(3), queue becomes:👉 q = [1, 2, 3]
        But this is not stack behavior — we want 3 to be on top, not at the end.
        */
         queue.offer(x);
    for (int i = queue.size() - 1; i > 0; i--) {//i>0
        //[1 2 3]
        //[2 3 1] > remove 1(removing from left) and add 1(adding from right)
        //[3 1 2] > remove 2(removing from left) and add 2(adding from right)
        //[3] <- bring 3 to the front, since its leftmost now - we return
        queue.offer(queue.poll());
        //Queues add to the back
        //Stacks want the last added item on top
        //So we rotate the queue after every push to simulate that "top" behavior
    }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
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