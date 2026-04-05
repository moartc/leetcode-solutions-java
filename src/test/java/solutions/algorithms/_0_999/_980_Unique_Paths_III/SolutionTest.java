package solutions.algorithms._0_999._980_Unique_Paths_III;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void uniquePathsIII1() {
        int[][] grid = new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 2, -1}};
        int answer = solution.uniquePathsIII(grid);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void uniquePathsIII2() {
        int[][] grid = new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 2}};
        int answer = solution.uniquePathsIII(grid);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void uniquePathsIII3() {
        int[][] grid = new int[][]{{0, 1}, {2, 0}};
        int answer = solution.uniquePathsIII(grid);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}