package solutions.algorithms._155_Min_Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MinStack {

    private List<Integer> list;
    private int min;

    public MinStack() {
        list = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val < min) {
            min = val;
        }
        list.add(val);
    }

    public void pop() {
        int removed = list.remove(list.size() - 1);
        if (removed == min) {
            setNewMin();
        }
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return min;
    }

    private void setNewMin() {
        if (list.size() > 0) {
            min = Collections.min(list);
        } else {
            min = Integer.MAX_VALUE;
        }
    }
}
