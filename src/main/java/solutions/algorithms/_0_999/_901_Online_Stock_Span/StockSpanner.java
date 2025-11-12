package solutions.algorithms._0_999._901_Online_Stock_Span;

import java.util.Stack;

class StockSpanner {

    /*
    Simple bruteforce approach, iterating backward from the current day beats 5%
    another approach:
    since it's a stack category I'm trying to use the stack
     */

    private final Stack<Pair> stack;
    private int ctr;

    public StockSpanner() {
        stack = new Stack<>();
        ctr = 0;
    }

    public int next(int price) {

        // the top holds the lowest value, I can pop all lower ones, then add my value,
        // returning the one I left, or the current counter if the stack is empty
        while (!stack.isEmpty() && stack.peek().v <= price) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            stack.add(new Pair(price, ctr));
            ctr++;
            return ctr;
        } else {
            Pair toReturn = stack.peek();
            stack.add(new Pair(price, ctr));
            int valToRet = ctr - toReturn.d;
            ctr++;
            return valToRet;
        }
    }

    /*
    value and day
     */
    class Pair {
        int v;
        int d;

        public Pair(int v, int d) {
            this.v = v;
            this.d = d;
        }
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */