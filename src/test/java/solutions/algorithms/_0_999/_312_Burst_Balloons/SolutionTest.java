package solutions.algorithms._0_999._312_Burst_Balloons;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxCoins1() {
        int[] nums = new int[]{3, 1, 5, 8};
        int answer = solution.maxCoins(nums);
        Assertions.assertThat(answer).isEqualTo(167);
    }

    @Test
    void maxCoins2() {
        int[] nums = new int[]{1, 5};
        int answer = solution.maxCoins(nums);
        Assertions.assertThat(answer).isEqualTo(10);
    }
}