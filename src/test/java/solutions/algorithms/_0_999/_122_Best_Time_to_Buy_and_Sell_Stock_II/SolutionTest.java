package solutions.algorithms._0_999._122_Best_Time_to_Buy_and_Sell_Stock_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxProfit1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int answer = solution.maxProfit(prices);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void maxProfit2() {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int answer = solution.maxProfit(prices);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maxProfit3() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int answer = solution.maxProfit(prices);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}