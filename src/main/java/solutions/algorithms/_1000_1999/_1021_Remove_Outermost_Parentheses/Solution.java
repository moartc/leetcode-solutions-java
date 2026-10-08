package solutions.algorithms._1000_1999._1021_Remove_Outermost_Parentheses;

class Solution {

    /*
    (()()) (()) (()(()))

    ()() (())
     */
    public String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int l = 0;
        int r = 0;
        int counter = 0;
        while (r < chars.length) {
            char curr = chars[r];
            if (curr == '(') {
                counter++;
            } else {
                counter--;
            }
            if (counter == 0) {
                int diff = r - l;
                if (diff > 1) {
                    sb.append(s, l + 1, r);
                }
                l = r + 1;
                r = r + 1;
            } else {
                r++;
            }
        }
        return sb.toString();
    }
}