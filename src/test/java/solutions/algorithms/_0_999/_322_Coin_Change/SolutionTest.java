package solutions.algorithms._0_999._322_Coin_Change;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void coinChangeTest1() {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        int actual = solution.coinChange(coins, amount);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void coinChangeTest2() {
        int[] coins = new int[]{2};
        int amount = 3;
        int actual = solution.coinChange(coins, amount);
        Assertions.assertThat(actual).isEqualTo(-1);
    }

    @Test
    void coinChangeTest3() {
        int[] coins = new int[]{1};
        int amount = 0;
        int actual = solution.coinChange(coins, amount);
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    void coinChangeTest4() {
        int[] coins = new int[]{1, 2, 3, 4, 5};
        int amount = 4;
        int actual = solution.coinChange(coins, amount);
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    void coinChangeTest5() {
        int[] coins = new int[]{1, 5};
        int amount = 4;
        int actual = solution.coinChange(coins, amount);
        Assertions.assertThat(actual).isEqualTo(4);
    }

    @Test
    void coinChangeTest6() {
        int[] coins = new int[]{2, 5, 10, 1};
        int amount = 27;
        int actual = solution.coinChange(coins, amount);
        Assertions.assertThat(actual).isEqualTo(4);
    }

    @Test
    void coinChangeTest7() {
        int[] coins = new int[]{186, 419, 83, 408};
        int amount = 6249;
        int actual = solution.coinChange(coins, amount);
        Assertions.assertThat(actual).isEqualTo(20);
    }

    @Test
    void coinChangeTest8() {
        int[] coins = new int[]{1, 6, 8};
        int amount = 18;
        int actual = solution.coinChange(coins, amount);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void coinChangeTest9() {
        int[] coins = new int[]{1, 2, 5};
        int amount = 100;
        int actual = solution.coinChange(coins, amount);
        Assertions.assertThat(actual).isEqualTo(20);
    }

    @Test
    void coinChangeTest10() {
        int[] coins = new int[]{1, 2, 5};
        int amount = 13;
        int actual = solution.coinChange(coins, amount);
        Assertions.assertThat(actual).isEqualTo(4);
    }

    @Test
    void coinChangeTest11() {
        int[] coins = new int[]{2, 5};
        int amount = 12;
        int actual = solution.coinChange(coins, amount);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void coinChangeTest12() {
        int[] coins = new int[]{2, 3};
        int amount = 7;
        int actual = solution.coinChange(coins, amount);
        Assertions.assertThat(actual).isEqualTo(3);
    }
}