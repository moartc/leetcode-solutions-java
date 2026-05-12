package solutions.algorithms._2000_2999._2110_Number_of_Smooth_Descent_Periods_of_a_Stock;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getDescentPeriods1() {
        int[] prices = new int[]{3, 2, 1, 4};
        long answer = solution.getDescentPeriods(prices);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void getDescentPeriods2() {
        int[] prices = new int[]{8, 6, 7, 7};
        long answer = solution.getDescentPeriods(prices);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void getDescentPeriods3() {
        int[] prices = new int[]{1};
        long answer = solution.getDescentPeriods(prices);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}