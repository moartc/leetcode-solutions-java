package solutions.algorithms._3000_3999._3622_Check_Divisibility_by_Digit_Sum_and_Product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkDivisibility1() {
        int n = 99;
        boolean answer = solution.checkDivisibility(n);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void checkDivisibility2() {
        int n = 23;
        boolean answer = solution.checkDivisibility(n);
        Assertions.assertThat(answer).isFalse();
    }
}