package solutions.algorithms._0_999._343_Integer_Break;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._343_Integer_Break.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void integerBreakTest1() {
        int n = 2;
        int expected = 1;
        int actual = solution.integerBreak(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void integerBreakTest2() {
        int n = 10;
        int expected = 36;
        int actual = solution.integerBreak(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void integerBreakTest3() {
        int n = 5;
        int expected = 2 * 3;
        int actual = solution.integerBreak(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void integerBreakTest4() {
        int n = 6;
        int expected = 3 * 3;
        int actual = solution.integerBreak(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void integerBreakTest5() {
        int n = 7;
        int expected = 2 * 2 * 3;
        int actual = solution.integerBreak(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void integerBreakTest6() {
        int n = 12;
        int expected = 81;
        int actual = solution.integerBreak(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void integerBreakTest7() {
        int n = 3;
        int expected = 2;
        int actual = solution.integerBreak(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void integerBreakTest8() {
        int n = 9;
        int expected = 27;
        int actual = solution.integerBreak(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}