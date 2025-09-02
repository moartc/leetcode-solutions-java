package solutions.algorithms._0_999._678_Valid_Parenthesis_String;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {


    /*
    At first sight, it looks like I could move with two pointers from the beginning and the end toward the middle,
    checking if both characters are valid.
    The problem is that there might cases like "(*******(**)**)", which are most likely valid,
    but it's hard to decide how to treat '*' along the way.

    update:
    there might be also cases like ((()()()()))

    update:
    I found a hint that I can track indices of opening brackets and indices of asterisks,
    so I am trying to implement something based on this hint.

     */
    public boolean checkValidString(String s) {

        PriorityQueue<Integer> openings = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> asterisks = new PriorityQueue<>(Comparator.reverseOrder());

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == '(') {
                openings.add(i);
            } else if (c == ')') {
                // try to match opening
                if (!openings.isEmpty()) {
                    openings.poll();
                } else if (!asterisks.isEmpty()) {
                    asterisks.poll();
                } else {
                    // cannot match either opening or asterisk
                    return false;
                }
            } else { // c == '*'
                asterisks.add(i);
            }
        }
        // if there are still openings try to find asterisks for closing it
        while (!openings.isEmpty()) {
            int opening = openings.poll();
            if (asterisks.isEmpty()) {
                return false;
            } else {
                Integer asterisk = asterisks.poll();
                if (asterisk < opening) {
                    return false;
                }
            }
        }
        return true;
    }
}