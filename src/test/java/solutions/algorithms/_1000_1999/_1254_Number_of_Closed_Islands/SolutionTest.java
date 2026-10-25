package solutions.algorithms._1000_1999._1254_Number_of_Closed_Islands;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void closedIsland1() {
        int[][] grid = new int[][]{{1, 1, 1, 1, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 1, 1, 0}, {1, 0, 0, 0, 0, 1, 0, 1}, {1, 1, 1, 1, 1, 1, 1, 0}};
        int answer = solution.closedIsland(grid);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void closedIsland2() {
        int[][] grid = new int[][]{{0, 0, 1, 0, 0}, {0, 1, 0, 1, 0}, {0, 1, 1, 1, 0}};
        int answer = solution.closedIsland(grid);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void closedIsland3() {
        int[][] grid = new int[][]{{1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 0, 0, 1}, {1, 0, 1, 1, 1, 0, 1}, {1, 0, 1, 0, 1, 0, 1}, {1, 0, 1, 1, 1, 0, 1}, {1, 0, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1, 1}};
        int answer = solution.closedIsland(grid);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}