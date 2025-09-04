package solutions.algorithms._0_999._746_Min_Cost_Climbing_Stairs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minCostClimbingStairs1() {
        int[] cost = new int[]{10, 15, 20};
        int answer = solution.minCostClimbingStairs(cost);
        Assertions.assertThat(answer).isEqualTo(15);
    }

    @Test
    void minCostClimbingStairs2() {
        int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int answer = solution.minCostClimbingStairs(cost);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void minCostClimbingStairs3() {
        int[] cost = new int[]{1, 100};
        int answer = solution.minCostClimbingStairs(cost);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}