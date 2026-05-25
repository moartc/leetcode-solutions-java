package solutions.algorithms._1000_1999._1351_Count_Negative_Numbers_in_a_Sorted_Matrix;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countNegatives1() {
        int[][] grid = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int answer = solution.countNegatives(grid);
        Assertions.assertThat(answer).isEqualTo(8);
    }

    @Test
    void countNegatives2() {
        int[][] grid = new int[][]{{3, 2}, {1, 0}};
        int answer = solution.countNegatives(grid);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}