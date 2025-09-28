package solutions.algorithms._0_999._518_Coin_Change_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void change1() {
        int amount = 5;
        int[] coins = new int[]{1, 2, 5};
        int answer = solution.change(amount, coins);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void change2() {
        int amount = 3;
        int[] coins = new int[]{2};
        int answer = solution.change(amount, coins);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void change3() {
        int amount = 10;
        int[] coins = new int[]{10};
        int answer = solution.change(amount, coins);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}