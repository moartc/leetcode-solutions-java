package solutions.algorithms._0_999._240_Search_a_2D_Matrix_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._240_Search_a_2D_Matrix_II.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void searchMatrixTest1() {

        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        boolean result = solution.searchMatrix(matrix, target);
        Assertions.assertThat(result).isEqualTo(true);
    }

    @Test
    void searchMatrixTest2() {

        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 20;
        boolean result = solution.searchMatrix(matrix, target);
        Assertions.assertThat(result).isEqualTo(false);
    }

    /*
     * 1  2  3  4  5
     * 6  7  8  9  10
     * 11 12 13 14 15
     * 16 17 18 19 20
     * 21 22 23 24 25
     */
    @Test
    void searchMatrixTest3() {

        int[][] matrix = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int target = 19;
        boolean result = solution.searchMatrix(matrix, target);
        Assertions.assertThat(result).isEqualTo(true);
    }
}