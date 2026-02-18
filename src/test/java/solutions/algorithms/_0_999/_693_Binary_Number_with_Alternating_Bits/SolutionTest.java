package solutions.algorithms._0_999._693_Binary_Number_with_Alternating_Bits;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void hasAlternatingBits1() {
        int n = 5;
        boolean answer = solution.hasAlternatingBits(n);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void hasAlternatingBits2() {
        int n = 7;
        boolean answer = solution.hasAlternatingBits(n);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void hasAlternatingBits3() {
        int n = 11;
        boolean answer = solution.hasAlternatingBits(n);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void hasAlternatingBits4() {
        int n = 2;
        boolean answer = solution.hasAlternatingBits(n);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void hasAlternatingBits5() {
        int n = 1;
        boolean answer = solution.hasAlternatingBits(n);
        Assertions.assertThat(answer).isTrue();
    }
}