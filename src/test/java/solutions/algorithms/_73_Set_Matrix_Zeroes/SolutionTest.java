package solutions.algorithms._73_Set_Matrix_Zeroes;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void setZeroesTest1() {
        int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        solution.setZeroes(matrix);

        int[][] expectedMatrix = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};
        Assertions.assertThat(matrix).isEqualTo(expectedMatrix);
    }

    @Test
    void setZeroesTest2() {
        int[][] matrix = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};

        solution.setZeroes(matrix);

        int[][] expectedMatrix = new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}};
        Assertions.assertThat(matrix).isEqualTo(expectedMatrix);
    }
}