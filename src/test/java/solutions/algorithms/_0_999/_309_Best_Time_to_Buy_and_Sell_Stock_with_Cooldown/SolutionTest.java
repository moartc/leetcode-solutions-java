package solutions.algorithms._0_999._309_Best_Time_to_Buy_and_Sell_Stock_with_Cooldown;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxProfit1() {
        int[] prices = new int[]{1, 2, 3, 0, 2};
        int answer = solution.maxProfit(prices);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maxProfit2() {
        int[] prices = new int[]{1};
        int answer = solution.maxProfit(prices);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void maxProfit3() {
        int[] prices = new int[]{2,1};
        int answer = solution.maxProfit(prices);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void maxProfit4() {
        int[] prices = new int[]{1, 2};
        int answer = solution.maxProfit(prices);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void maxProfit5() {
        int[] prices = new int[]{1, 4, 2};
        int answer = solution.maxProfit(prices);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maxProfit6() {
        int[] prices = new int[]{1, 4, 0, 6};
        int answer = solution.maxProfit(prices);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}