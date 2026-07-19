package solutions.algorithms._1000_1999._1081_Smallest_Subsequence_of_Distinct_Characters;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

class Solution {
    public String smallestSubsequence(String s) {

        char[] charArray = s.toCharArray();
        int[] charMap = new int[26];
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            charMap[c - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();
        Set<Character> used = new HashSet<>();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            while (!stack.isEmpty() && !used.contains(c) && stack.peek() > c && charMap[stack.peek() - 'a'] > i) {
                used.remove(stack.peek());
                stack.pop();

            }
            if (!used.contains(c)) {
                stack.add(c);
                used.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}