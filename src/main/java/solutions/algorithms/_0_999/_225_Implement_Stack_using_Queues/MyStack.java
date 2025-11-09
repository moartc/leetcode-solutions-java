package solutions.algorithms._0_999._225_Implement_Stack_using_Queues;

import java.util.LinkedList;

class MyStack {

    private final LinkedList<Integer> list;

    public MyStack() {
        list = new LinkedList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        int toReturn = list.getLast();
        list.removeLast();
        return toReturn;
    }

    public int top() {
        return list.getLast();
    }

    public boolean empty() {
        return list.isEmpty();
    }
}