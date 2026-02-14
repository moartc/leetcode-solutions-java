package solutions.algorithms._0_999._301_Remove_Invalid_Parentheses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void removeInvalidParentheses1() {
        String s = "()())()";
        List<String> answer = solution.removeInvalidParentheses(s);
        Assertions.assertThat(answer).containsExactlyInAnyOrder("(())()", "()()()");
    }

    @Test
    void removeInvalidParentheses2() {
        String s = "(a)())()";
        List<String> answer = solution.removeInvalidParentheses(s);
        Assertions.assertThat(answer).containsExactlyInAnyOrder("(a())()", "(a)()()");
    }

    @Test
    void removeInvalidParentheses3() {
        String s = ")(";
        List<String> answer = solution.removeInvalidParentheses(s);
        Assertions.assertThat(answer).containsExactlyInAnyOrder("");
    }

    @Test
    void removeInvalidParentheses4() {
        // my additional case
        String s = "())(()";
        List<String> answer = solution.removeInvalidParentheses(s);
        Assertions.assertThat(answer).containsExactlyInAnyOrder("()()");
    }
}