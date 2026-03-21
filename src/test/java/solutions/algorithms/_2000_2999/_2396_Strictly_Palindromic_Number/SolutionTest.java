package solutions.algorithms._2000_2999._2396_Strictly_Palindromic_Number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isStrictlyPalindromic1() {
        int n = 9;
        boolean answer = solution.isStrictlyPalindromic(n);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isStrictlyPalindromic2() {
        int n = 4;
        boolean answer = solution.isStrictlyPalindromic(n);
        Assertions.assertThat(answer).isFalse();
    }
}