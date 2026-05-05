class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        //if nothing is in the stack then push to have at least first minimum
        //if smth is already there, then check the val if its less then the val in the stack, then push
        //push() bc we keep a track of min val in the stack, so next time we peek()
        //we will have the top val as a min val
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
   public void pop() {
        if (stack.isEmpty()) return;
        //The stacks will get out of sync
        //Both stack and minStack should be kept in sync — 
        //every time you push or pop a value from the main stack, 
        //you should also handle minStack properly to keep the correct minimum value.
        //int top = stack.pop();//we must remove from main stack
        //push and pop from both to maintain both
        //You lose the value if it’s not equal
        // if (stack.pop() == minStack.peek()) {
        //     minStack.pop();
        // }
        //You store the value safely for logic checks or future use
        //It’s more readable and maintainable
        //It avoids confusion with stack side effects
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        //we will check the top of stack 1
        return stack.peek();
    }
    
    public int getMin() {
        //the min val is tracked in stack 2
        return minStack.peek();
    }
}
