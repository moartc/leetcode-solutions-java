package solutions.algorithms._0_999._856_Score_of_Parentheses;

class Solution {
    public int scoreOfParentheses(String s) {
        char[] chars = s.toCharArray();
        return countGroup(0, chars)[0];
    }

    int[] countGroup(int start, char[] cArr) {

        int ctr = 0;
        for (int i = start; i < cArr.length; i++) {
            int curr = cArr[i];
            if (curr == ')') {
                return new int[]{ctr, i + 1};
            } else if (curr == '(') {
                if (cArr[i + 1] == ')') {
                    ctr += 1;
                    i = i + 1;
                } else { // case ((
                    int[] next = countGroup(i + 1, cArr);
                    ctr += (2 * next[0]);
                    i = next[1] - 1;
                }
            }
        }
        return new int[]{ctr, -1};
    }

}