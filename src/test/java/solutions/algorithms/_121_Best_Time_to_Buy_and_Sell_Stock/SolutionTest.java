package solutions.algorithms._121_Best_Time_to_Buy_and_Sell_Stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void maxProfitTest1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int expected = 5;
        int actual = solution.maxProfit(prices);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxProfitTest2() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int expected = 0;
        int actual = solution.maxProfit(prices);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxProfitTest3() {
        int[] prices = new int[]{4, 2, 1, 7};
        int expected = 6;
        int actual = solution.maxProfit(prices);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxProfitTest4() {
        int[] prices = new int[]{2, 11, 1, 4, 7};
        int expected = 9;
        int actual = solution.maxProfit(prices);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxProfitTest5() {
        int[] prices = new int[]{4, 7, 2, 1};
        int expected = 3;
        int actual = solution.maxProfit(prices);
        Assertions.assertEquals(expected, actual);
    }
}