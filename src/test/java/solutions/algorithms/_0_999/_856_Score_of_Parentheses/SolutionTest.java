package solutions.algorithms._0_999._856_Score_of_Parentheses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void scoreOfParentheses1() {
        String s = "()";
        int answer = solution.scoreOfParentheses(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void scoreOfParentheses2() {
        String s = "(())";
        int answer = solution.scoreOfParentheses(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void scoreOfParentheses3() {
        String s = "()()";
        int answer = solution.scoreOfParentheses(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }


    @Test
    void scoreOfParentheses4() {
        String s = "(()(()))";
        int answer = solution.scoreOfParentheses(s);
        Assertions.assertThat(answer).isEqualTo(6);
    }

}