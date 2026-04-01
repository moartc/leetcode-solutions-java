package solutions.algorithms._0_999._807_Max_Increase_to_Keep_City_Skyline;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxIncreaseKeepingSkyline1() {
        int[][] grid = new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        int answer = solution.maxIncreaseKeepingSkyline(grid);
        Assertions.assertThat(answer).isEqualTo(35);
    }

    @Test
    void maxIncreaseKeepingSkyline2() {
        int[][] grid = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int answer = solution.maxIncreaseKeepingSkyline(grid);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}