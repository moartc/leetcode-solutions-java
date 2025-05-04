package solutions.algorithms._0_999._150_Evaluate_Reverse_Polish_Notation;

import java.util.Stack;

class Solution {

    Stack<Integer> stack = new Stack<>();

    public int evalRPN(String[] tokens) {

        for (String token : tokens) {

            if (token.equals("+")) {
                int second = stack.pop();
                int first = stack.pop();
                int result = first + second;
                stack.push(result);
            } else if (token.equals("-")) {
                int second = stack.pop();
                int first = stack.pop();
                int result = first - second;
                stack.push(result);
            } else if (token.equals("*")) {
                int second = stack.pop();
                int first = stack.pop();
                int result = first * second;
                stack.push(result);
            } else if (token.equals("/")) {
                int second = stack.pop();
                int first = stack.pop();
                int result = first / second;
                stack.push(result);
            } else { // integer
                int integer = Integer.parseInt(token);
                stack.push(integer);
            }
        }
        return stack.pop();
    }
}