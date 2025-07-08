package solutions.algorithms._0_999._74_Search_a_2D_Matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void searchMatrixTest1() {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 3;
        assertThat(solution.searchMatrix(matrix, target)).isTrue();
    }

    @Test
    void searchMatrixTest2() {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 13;
        assertThat(solution.searchMatrix(matrix, target)).isFalse();
    }

    @Test
    void searchMatrixTest3() {
        int[][] matrix = new int[][]{{1}};
        int target = 3;
        assertThat(solution.searchMatrix(matrix, target)).isFalse();
    }
}