package solutions.algorithms._1000_1999._1267_Count_Servers_that_Communicate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countServers1() {
        int[][] grid = new int[][]{{1, 0}, {0, 1}};
        int answer = solution.countServers(grid);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void countServers2() {
        int[][] grid = new int[][]{{1, 0}, {1, 1}};
        int answer = solution.countServers(grid);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void countServers3() {
        int[][] grid = new int[][]{{1, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        int answer = solution.countServers(grid);
        Assertions.assertThat(answer).isEqualTo(4);
    }
}