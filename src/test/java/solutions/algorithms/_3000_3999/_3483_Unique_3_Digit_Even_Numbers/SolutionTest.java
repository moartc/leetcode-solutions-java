package solutions.algorithms._3000_3999._3483_Unique_3_Digit_Even_Numbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void totalNumbers1() {
        int[] digits = new int[]{1, 2, 3, 4};
        int answer = solution.totalNumbers(digits);
        Assertions.assertThat(answer).isEqualTo(12);
    }

    @Test
    void totalNumbers2() {
        int[] digits = new int[]{0, 2, 2};
        int answer = solution.totalNumbers(digits);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void totalNumbers3() {
        int[] digits = new int[]{6, 6, 6};
        int answer = solution.totalNumbers(digits);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void totalNumbers4() {
        int[] digits = new int[]{1, 3, 5};
        int answer = solution.totalNumbers(digits);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}