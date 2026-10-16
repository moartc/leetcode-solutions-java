package solutions.algorithms._0_999._326_Power_of_Three;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isPowerOfThree1() {
        int n = 27;
        boolean answer = solution.isPowerOfThree(n);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isPowerOfThree2() {
        int n = 0;
        boolean answer = solution.isPowerOfThree(n);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isPowerOfThree3() {
        int n = -1;
        boolean answer = solution.isPowerOfThree(n);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isPowerOfThree4() {
        int n = 1;
        boolean answer = solution.isPowerOfThree(n);
        Assertions.assertThat(answer).isTrue();
    }
}