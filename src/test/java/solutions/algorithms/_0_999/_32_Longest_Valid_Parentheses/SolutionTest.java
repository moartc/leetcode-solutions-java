package solutions.algorithms._0_999._32_Longest_Valid_Parentheses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestValidParentheses1() {
        String s = "(()";
        int answer = solution.longestValidParentheses(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void longestValidParentheses2() {
        String s = ")()())";
        int answer = solution.longestValidParentheses(s);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void longestValidParentheses3() {
        String s = "";
        int answer = solution.longestValidParentheses(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void longestValidParentheses4() {
        String s = "()(()";
        int answer = solution.longestValidParentheses(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}