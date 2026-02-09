package solutions.algorithms._0_999._32_Longest_Valid_Parentheses;

import java.util.Stack;

class Solution {

    /*
    ()(()()
    ok, a bit stupid, but:
    I can store opening parentheses on a stack along with their index in the string
    then when I match '(' with ')' I mark both as matched in another array (boolean)
    After that, I iterate through this arr again and count the longest sequence of true values.

    Even better than I though, since I only need to push opening parentheses I can just push
    the integer representing the index.
    it bets 79.60%
    maybe I could also count it in the same iteration (instead of iterating again) but
    I'm satisfied with the current result.
    */
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();
        boolean[] mark = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else { // c == ')'
                if (!stack.isEmpty()) {
                    Integer pop = stack.pop();
                    mark[pop] = true;
                    mark[i] = true;
                }
            }
        }
        int coutner = 0;
        int maxFound = 0;
        for (boolean b : mark) {
            if (b) {
                coutner++;
            } else {
                maxFound = Math.max(maxFound, coutner);
                coutner = 0;
            }
        }
        maxFound = Math.max(maxFound, coutner);
        return maxFound;
    }

}