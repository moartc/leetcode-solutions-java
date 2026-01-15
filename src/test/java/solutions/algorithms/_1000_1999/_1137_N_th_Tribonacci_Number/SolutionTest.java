package solutions.algorithms._1000_1999._1137_N_th_Tribonacci_Number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void tribonacci1() {
        int n = 4;
        int answer = solution.tribonacci(n);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void tribonacci2() {
        int n = 25;
        int answer = solution.tribonacci(n);
        Assertions.assertThat(answer).isEqualTo(1389537);
    }
}