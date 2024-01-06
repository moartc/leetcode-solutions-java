package solutions.algorithms._0_999._20_Valid_Parentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        String opens = "({[";
        Stack<Character> characterStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (opens.indexOf(c) != -1) {
                characterStack.push(c);
            } else {
                if(characterStack.empty()) {
                    return false;
                }
                if (!isPair(characterStack.pop(), c)) {
                    return false;
                }
            }
        }
        return characterStack.empty();
    }

    public boolean isPair(char first, char second) {
        if (first == '(') {
            return second == ')';
        } else if (first == '{') {
            return second == '}';
        } else if (first == '[') {
            return second == ']';
        }
        return false;
    }
}