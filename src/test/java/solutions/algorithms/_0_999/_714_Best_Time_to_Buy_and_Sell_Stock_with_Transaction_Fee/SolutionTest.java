package solutions.algorithms._0_999._714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxProfit1() {
        int[] prices = new int[]{1, 3, 2, 8, 4, 9};
        int fee = 2;
        int answer = solution.maxProfit(prices, fee);
        Assertions.assertThat(answer).isEqualTo(8);
    }

    @Test
    void maxProfit2() {
        int[] prices = new int[]{1, 3, 7, 5, 10, 3};
        int fee = 3;
        int answer = solution.maxProfit(prices, fee);
        Assertions.assertThat(answer).isEqualTo(6);
    }
}