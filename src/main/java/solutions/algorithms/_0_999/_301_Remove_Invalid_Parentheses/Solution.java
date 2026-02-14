package solutions.algorithms._0_999._301_Remove_Invalid_Parentheses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    int bestDelCtr = Integer.MAX_VALUE;
    int bestDelBackCtr = Integer.MAX_VALUE;

    /*
    a pair of parentheses is valid if there are both '(' and ')'

    I can go through the string and use an int array to track a parentheses counter. For each ( I add 1, for each ) I subtract 1
    When the sum goes below 0 (i.e. -1) I know I closed more than I opened. on the left side (including the one that gives me '-1')
    I can remove every extra closing bracket to make the string valid.

    I can use DFS here with the logic described above and the opening bracket I can handle by running the same logic backwards.

    update: even without special optimization it beats 84.84%
     */
    public List<String> removeInvalidParentheses(String s) {

        char[] charArray = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        HashSet<String> forwardStrings = new HashSet<>();
        dfsForward(sb, charArray, 0, 0, forwardStrings, 0);
        Set<String> finalResult = new HashSet<>();
        for (String forwardString : forwardStrings) {
            dfsBackward(new StringBuilder(), forwardString.toCharArray(), forwardString.length() - 1, 0, finalResult, 0);
        }

        return new ArrayList<>(finalResult);
    }

    // it makes sure that I close as many as I opened, so it removes ')' only
    void dfsForward(StringBuilder currSb, char[] charArray, int idx, int ctr, Set<String> createdStrings, int delCtr) {

        if (ctr < 0) {
            return;
        }
        if (idx >= charArray.length) {
            if (delCtr < bestDelCtr) {
                bestDelCtr = delCtr;
                createdStrings.clear();
                createdStrings.add(currSb.toString());
            } else if (delCtr == bestDelCtr) {
                createdStrings.add(currSb.toString());
            } else {
                // ignore
            }
        } else {
            char c = charArray[idx];
            if (c == '(') {
                StringBuilder newSb = new StringBuilder(currSb);
                newSb.append(c);
                dfsForward(newSb, charArray, idx + 1, ctr + 1, createdStrings, delCtr);
            } else if (c == ')') {
                StringBuilder newSb = new StringBuilder(currSb);
                newSb.append(c);
                dfsForward(newSb, charArray, idx + 1, ctr - 1, createdStrings, delCtr);
                // and with removal
                StringBuilder newSb2 = new StringBuilder(currSb);
                dfsForward(newSb2, charArray, idx + 1, ctr, createdStrings, delCtr + 1);
            } else {
                StringBuilder newSb = new StringBuilder(currSb);
                newSb.append(c);
                dfsForward(newSb, charArray, idx + 1, ctr, createdStrings, delCtr);
            }
        }
    }

    void dfsBackward(StringBuilder currSb, char[] charArray, int idx, int ctr, Set<String> createdStrings, int delCtr) {
        if (ctr < 0) {
            return;
        }
        if (idx < 0) {
            if (delCtr < bestDelBackCtr) {
                bestDelBackCtr = delCtr;
                createdStrings.clear();
                createdStrings.add(currSb.reverse().toString());
            } else if (delCtr == bestDelBackCtr) {
                createdStrings.add(currSb.reverse().toString());
            } else {
                // ignore
            }
        } else {
            char c = charArray[idx];
            if (c == '(') {
                StringBuilder newSb = new StringBuilder(currSb);
                newSb.append(c);
                dfsBackward(newSb, charArray, idx - 1, ctr - 1, createdStrings, delCtr);
                // and with removal
                StringBuilder newSb2 = new StringBuilder(currSb);
                dfsBackward(newSb2, charArray, idx - 1, ctr, createdStrings, delCtr + 1);
            } else if (c == ')') {
                StringBuilder newSb = new StringBuilder(currSb);
                newSb.append(c);
                dfsBackward(newSb, charArray, idx - 1, ctr + 1, createdStrings, delCtr);
            } else {
                StringBuilder newSb = new StringBuilder(currSb);
                newSb.append(c);
                dfsBackward(newSb, charArray, idx - 1, ctr, createdStrings, delCtr);
            }
        }
    }
}