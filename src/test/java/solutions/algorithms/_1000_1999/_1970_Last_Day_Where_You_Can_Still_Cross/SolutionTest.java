package solutions.algorithms._1000_1999._1970_Last_Day_Where_You_Can_Still_Cross;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void latestDayToCross1() {
        int row = 2;
        int col = 2;
        int[][] cells = new int[][]{{1, 1}, {2, 1}, {1, 2}, {2, 2}};
        int answer = solution.latestDayToCross(row, col, cells);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void latestDayToCross2() {
        int row = 2;
        int col = 2;
        int[][] cells = new int[][]{{1, 1}, {1, 2}, {2, 1}, {2, 2}};
        int answer = solution.latestDayToCross(row, col, cells);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void latestDayToCross3() {
        int row = 3;
        int col = 3;
        int[][] cells = new int[][]{{1, 1}, {2, 1}, {3, 3}, {2, 2}, {1, 1}, {1, 3}, {2, 3}, {3, 2}, {3, 1}};
        int answer = solution.latestDayToCross(row, col, cells);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}