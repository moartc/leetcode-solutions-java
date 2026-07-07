package solutions.algorithms._3000_3999._3754_Concatenate_Non_Zero_Digits_and_Multiply_by_Sum_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sumAndMultiply1() {
        int n = 10203004;
        long answer = solution.sumAndMultiply(n);
        Assertions.assertThat(answer).isEqualTo(12340);
    }

    @Test
    void sumAndMultiply2() {
        int n = 1000;
        long answer = solution.sumAndMultiply(n);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void sumAndMultiply3() {
        int n = 65463628;
        long answer = solution.sumAndMultiply(n);
        Assertions.assertThat(answer).isEqualTo(2618545120L);
    }
}