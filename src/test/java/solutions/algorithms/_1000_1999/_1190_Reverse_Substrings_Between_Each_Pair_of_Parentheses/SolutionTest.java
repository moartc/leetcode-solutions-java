package solutions.algorithms._1000_1999._1190_Reverse_Substrings_Between_Each_Pair_of_Parentheses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseParentheses1() {
        String s = "(abcd)";
        String answer = solution.reverseParentheses(s);
        Assertions.assertThat(answer).isEqualTo("dcba");
    }

    @Test
    void reverseParentheses2() {
        String s = "(u(love)i)";
        String answer = solution.reverseParentheses(s);
        Assertions.assertThat(answer).isEqualTo("iloveu");
    }

    @Test
    void reverseParentheses3() {
        String s = "(ed(et(oc))el)";
        String answer = solution.reverseParentheses(s);
        Assertions.assertThat(answer).isEqualTo("leetcode");
    }
}