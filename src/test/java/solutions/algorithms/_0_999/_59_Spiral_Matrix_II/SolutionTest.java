package solutions.algorithms._0_999._59_Spiral_Matrix_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._59_Spiral_Matrix_II.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void generateMatrixTest1() {
        int[][] expected = new int[][]{{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        int[][] actual = solution.generateMatrix(3);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void generateMatrixTest2() {
        int[][] expected = new int[][]{{1}};
        int[][] actual = solution.generateMatrix(1);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void generateMatrixTest3() {
        int[][] expected = new int[][]{{1, 2}, {4, 3}};
        int[][] actual = solution.generateMatrix(2);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}