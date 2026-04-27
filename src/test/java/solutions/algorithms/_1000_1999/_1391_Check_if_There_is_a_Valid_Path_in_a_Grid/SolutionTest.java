package solutions.algorithms._1000_1999._1391_Check_if_There_is_a_Valid_Path_in_a_Grid;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void hasValidPath1() {
        int[][] grid = new int[][]{{2, 4, 3}, {6, 5, 2}};
        boolean answer = solution.hasValidPath(grid);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void hasValidPath2() {
        int[][] grid = new int[][]{{1, 2, 1}, {1, 2, 1}};
        boolean answer = solution.hasValidPath(grid);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void hasValidPath3() {
        int[][] grid = new int[][]{{1, 1, 2}};
        boolean answer = solution.hasValidPath(grid);
        Assertions.assertThat(answer).isFalse();
    }
}