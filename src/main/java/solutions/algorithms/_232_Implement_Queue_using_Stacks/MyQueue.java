package solutions.algorithms._232_Implement_Queue_using_Stacks;

import java.util.Stack;

class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {
    }

    public void push(int x) {

        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }

        stack2.push(x);

        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
    }

    public int pop() {
        return stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean empty() {
        return stack1.empty();
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

