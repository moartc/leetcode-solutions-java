package solutions.algorithms._0_999._566_Reshape_the_Matrix;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._566_Reshape_the_Matrix.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void matrixReshapeTest1() {
        int[][] mat = new int[][]{{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int[][] expected = new int[][]{{1, 2, 3, 4}};
        Assertions.assertThat(solution.matrixReshape(mat, r, c)).isEqualTo(expected);
    }

    @Test
    void matrixReshapeTest2() {
        int[][] mat = new int[][]{{1, 2}, {3, 4}};
        int r = 2;
        int c = 4;
        int[][] expected = new int[][]{{1, 2}, {3, 4}};
        Assertions.assertThat(solution.matrixReshape(mat, r, c)).isEqualTo(expected);
    }

    @Test
    void matrixReshapeTest3() {
        int[][] mat = new int[][]{{1, 2}, {3, 4}};
        int r = 4;
        int c = 1;
        int[][] expected = new int[][]{{1}, {2}, {3}, {4}};
        Assertions.assertThat(solution.matrixReshape(mat, r, c)).isEqualTo(expected);
    }
}