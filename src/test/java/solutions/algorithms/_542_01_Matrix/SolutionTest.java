package solutions.algorithms._542_01_Matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void updateMatrixTest1() {
        int[][] mat = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int[][] expected = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        Assertions.assertArrayEquals(expected, solution.updateMatrix(mat));
    }

    @Test
    void updateMatrixTest2() {
        int[][] mat = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] expected = new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 2, 1}};
        Assertions.assertArrayEquals(expected, solution.updateMatrix(mat));
    }
}