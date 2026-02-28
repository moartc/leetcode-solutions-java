package solutions.algorithms._1000_1999._1680_Concatenation_of_Consecutive_Binary_Numbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void concatenatedBinary1() {
        int answer = solution.concatenatedBinary(1);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void concatenatedBinary2() {
        int answer = solution.concatenatedBinary(3);
        Assertions.assertThat(answer).isEqualTo(27);
    }

    @Test
    void concatenatedBinary3() {
        int answer = solution.concatenatedBinary(12);
        Assertions.assertThat(answer).isEqualTo(505379714);
    }
}