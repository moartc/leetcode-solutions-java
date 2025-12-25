package solutions.algorithms._0_999._463_Island_Perimeter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void islandPerimeter1() {
        int[][] grid = new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int answer = solution.islandPerimeter(grid);
        Assertions.assertThat(answer).isEqualTo(16);
    }

    @Test
    void islandPerimeter2() {
        int[][] grid = new int[][]{{1}};
        int answer = solution.islandPerimeter(grid);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void islandPerimeter3() {
        int[][] grid = new int[][]{{1, 0}};
        int answer = solution.islandPerimeter(grid);
        Assertions.assertThat(answer).isEqualTo(4);
    }
}