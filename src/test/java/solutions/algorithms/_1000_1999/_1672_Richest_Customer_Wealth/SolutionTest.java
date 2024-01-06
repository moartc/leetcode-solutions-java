package solutions.algorithms._1000_1999._1672_Richest_Customer_Wealth;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumWealthTest1() {
        int[][] accounts = new int[][]{{1, 2, 3}, {3, 2, 1}};
        int actual = solution.maximumWealth(accounts);
        Assertions.assertThat(actual).isEqualTo(6);
    }

    @Test
    void maximumWealthTest2() {
        int[][] accounts = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        int actual = solution.maximumWealth(accounts);
        Assertions.assertThat(actual).isEqualTo(10);
    }

    @Test
    void maximumWealthTest3() {
        int[][] accounts = new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int actual = solution.maximumWealth(accounts);
        Assertions.assertThat(actual).isEqualTo(17);
    }
}