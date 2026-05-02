package solutions.algorithms._0_999._788_Rotated_Digits;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rotatedDigits1() {
        int n = 10;
        int answer = solution.rotatedDigits(n);
        Assertions.assertThat(answer).isEqualTo(4);
    }


    @Test
    void rotatedDigits2() {
        int n = 1;
        int answer = solution.rotatedDigits(n);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void rotatedDigits3() {
        int n = 2;
        int answer = solution.rotatedDigits(n);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}