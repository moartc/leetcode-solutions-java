package solutions.algorithms._0_999._29_Divide_Two_Integers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void divide1() {
        int dividend = 10;
        int divisor = 3;
        int answer = solution.divide(dividend, divisor);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void divide2() {
        int dividend = 7;
        int divisor = -3;
        int answer = solution.divide(dividend, divisor);
        Assertions.assertThat(answer).isEqualTo(-2);
    }

    @Test
    void divide3() {
        int dividend = 1;
        int divisor = 1;
        int answer = solution.divide(dividend, divisor);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void divide4() {
        int dividend = -2147483648;
        int divisor = -1;
        int answer = solution.divide(dividend, divisor);
        Assertions.assertThat(answer).isEqualTo(2147483647);
    }
}