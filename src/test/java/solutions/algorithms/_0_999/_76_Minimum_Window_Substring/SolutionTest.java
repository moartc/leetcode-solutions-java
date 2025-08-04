package solutions.algorithms._0_999._76_Minimum_Window_Substring;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minWindowTest1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String expected = "BANC";
        String answer = solution.minWindow(s, t);
        Assertions.assertThat(answer).isEqualTo(expected);
    }

    @Test
    void minWindowTest2() {
        String s = "a";
        String t = "a";
        String expected = "a";
        String answer = solution.minWindow(s, t);
        Assertions.assertThat(answer).isEqualTo(expected);
    }

    @Test
    void minWindowTest3() {
        String s = "a";
        String t = "aa";
        String expected = "";
        String answer = solution.minWindow(s, t);
        Assertions.assertThat(answer).isEqualTo(expected);
    }
}