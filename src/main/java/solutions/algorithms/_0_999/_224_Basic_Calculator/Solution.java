package solutions.algorithms._0_999._224_Basic_Calculator;

import java.util.Stack;

class Solution {

    /*
    Iterate from left to right and track the sign (it's always only +/-)
    when I see ( I store the previous result, the sign before '(' and then process
     the new number inside.
    When I encounter ')' I store the previous result  (with the previous sign, so it can
     effectively subtract) to the previously stored res.

    update: I will create a stack for digit and sign
     */

    public int calculate(String s) {

        char[] arr = s.toCharArray();
        // current result
        int result = 0;
        int sign = 1;

        int currentDigit = 0;

        Stack<Integer> resStack = new Stack<>();
        Stack<Integer> signStack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == '(') {
                result += (sign * currentDigit);
                signStack.push(sign);
                resStack.push(result);
                result = 0;
                sign = 1;
            } else if (c == ')') {
                // now, finish the result
                result += (sign * currentDigit);
                // get the sign I have before this sub expression
                Integer poppedSign = signStack.pop();
                // and get the previous result
                int newResult = resStack.pop();
                newResult += (poppedSign * result);
                result = newResult;
                // I have to reset this
                currentDigit = 0;
            } else if (c == ' ') {
                // add previous digit to the result, respecting sign
                result += (sign * currentDigit);
                currentDigit = 0;
                // don't reset sign here 0 testcase 6
            } else if (c >= '0' && c <= '9') {
                currentDigit = (currentDigit * 10) + (c - '0');
            } else { // + or -
                result += (sign * currentDigit);
                currentDigit = 0;
                if (c == '-') {
                    sign = -1;
                } else {
                    sign = 1;
                }
            }
        }
        // here I might have some digit
        result += (sign * currentDigit);
        return result;
    }
}