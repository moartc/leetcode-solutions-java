package solutions.algorithms._3000_3999._3751_Total_Waviness_of_Numbers_in_Range_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void totalWaviness1() {
        int num1 = 120;
        int num2 = 130;
        int answer = solution.totalWaviness(num1, num2);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void totalWaviness2() {
        int num1 = 198;
        int num2 = 202;
        int answer = solution.totalWaviness(num1, num2);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void totalWaviness3() {
        int num1 = 4848;
        int num2 = 4848;
        int answer = solution.totalWaviness(num1, num2);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}