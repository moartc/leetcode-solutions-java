package solutions.algorithms._0_999._921_Minimum_Add_to_Make_Parentheses_Valid;

class Solution {

    /*
    go right and count '(', when I see ')', decrease counter for '(' and if it's < 0 add glob counter +1
    the same left by counting ')' and '('
    +1 for '(', -1 for ')' and the answer is abs of that counter
     */
    public int minAddToMakeValid(String s) {

        int answer = 0;
        char[] chars = s.toCharArray();
        int fc = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(') {
                fc++;
            } else { // c == ')'
                fc--;
                if (fc < 0) {
                    fc = 0;
                    answer++;
                }
            }
        }
        int sc = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            char c = chars[i];
            if (c == ')') {
                sc++;
            } else { // c == ')'
                sc--;
                if (sc < 0) {
                    sc = 0;
                    answer++;
                }
            }
        }
        return answer;
    }
}