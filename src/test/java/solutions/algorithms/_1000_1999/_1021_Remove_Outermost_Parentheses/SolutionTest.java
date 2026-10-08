package solutions.algorithms._1000_1999._1021_Remove_Outermost_Parentheses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void removeOuterParentheses1() {
        String s = "(()())(())";
        String answer = solution.removeOuterParentheses(s);
        Assertions.assertThat(answer).isEqualTo("()()()");
    }

    @Test
    void removeOuterParentheses2() {
        String s = "(()())(())(()(()))";
        String answer = solution.removeOuterParentheses(s);
        Assertions.assertThat(answer).isEqualTo("()()()()(())");
    }

    @Test
    void removeOuterParentheses3() {
        String s = "()()";
        String answer = solution.removeOuterParentheses(s);
        Assertions.assertThat(answer).isEqualTo("");
    }
}