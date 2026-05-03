package solutions.algorithms._0_999._796_Rotate_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rotateString1() {
        String s = "abcde";
        String goal = "cdeab";
        boolean answer = solution.rotateString(s, goal);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void rotateString2() {
        String s = "abcde";
        String goal = "abced";
        boolean answer = solution.rotateString(s, goal);
        Assertions.assertThat(answer).isFalse();
    }
}