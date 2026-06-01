package solutions.algorithms._2000_2999._2144_Minimum_Cost_of_Buying_Candies_With_Discount;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumCost1() {
        int[] cost = new int[]{1, 2, 3};
        int answer = solution.minimumCost(cost);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void minimumCost2() {
        int[] cost = new int[]{6, 5, 7, 9, 2, 2};
        int answer = solution.minimumCost(cost);
        Assertions.assertThat(answer).isEqualTo(23);
    }

    @Test
    void minimumCost3() {
        int[] cost = new int[]{5, 5};
        int answer = solution.minimumCost(cost);
        Assertions.assertThat(answer).isEqualTo(10);
    }
}