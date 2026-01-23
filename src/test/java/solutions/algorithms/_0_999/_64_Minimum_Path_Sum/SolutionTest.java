package solutions.algorithms._0_999._64_Minimum_Path_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minPathSum1() {
        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int answer = solution.minPathSum(grid);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void minPathSum2() {
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int answer = solution.minPathSum(grid);
        Assertions.assertThat(answer).isEqualTo(12);
    }
}