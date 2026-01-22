package solutions.algorithms._0_999._63_Unique_Paths_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void uniquePathsWithObstacles1() {
        int[][] obstacleGrid = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int answer = solution.uniquePathsWithObstacles(obstacleGrid);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void uniquePathsWithObstacles2() {
        int[][] obstacleGrid = new int[][]{{0, 1}, {0, 0}};
        int answer = solution.uniquePathsWithObstacles(obstacleGrid);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}