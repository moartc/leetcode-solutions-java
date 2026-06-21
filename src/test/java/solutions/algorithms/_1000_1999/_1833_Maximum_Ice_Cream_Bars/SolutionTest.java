package solutions.algorithms._1000_1999._1833_Maximum_Ice_Cream_Bars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxIceCream1() {
        int[] costs = new int[]{1, 3, 2, 4, 1};
        int coins = 7;
        int answer = solution.maxIceCream(costs, coins);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maxIceCream2() {
        int[] costs = new int[]{10, 6, 8, 7, 7, 8};
        int coins = 5;
        int answer = solution.maxIceCream(costs, coins);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void maxIceCream3() {
        int[] costs = new int[]{1, 6, 3, 1, 2, 5};
        int coins = 20;
        int answer = solution.maxIceCream(costs, coins);
        Assertions.assertThat(answer).isEqualTo(6);
    }
}