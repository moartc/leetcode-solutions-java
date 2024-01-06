package solutions.algorithms._0_999._74_Search_a_2D_Matrix;

import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._74_Search_a_2D_Matrix.Solution;

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

    @Test
    void binSearchRowTest1() {
        int[][] matrix = new int[][]{{1}, {3}, {4}, {5}, {7}, {8}, {9}};
        int target = 0;
        int expected = -1;
        int actual = solution.binSearchRow(matrix, target);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void binSearchRowTest2() {
        int[][] matrix = new int[][]{{1}, {3}, {4}, {5}, {7}, {8}, {9}};
        int target = 1;
        int expected = 0;
        int actual = solution.binSearchRow(matrix, target);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void binSearchRowTest3() {
        int[][] matrix = new int[][]{{1}, {3}, {4}, {5}, {7}, {8}, {9}};
        int target = 9;
        int expected = 6;
        int actual = solution.binSearchRow(matrix, target);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void binSearchRowTest4() {
        int[][] matrix = new int[][]{{1}, {3}, {4}, {5}, {7}, {8}, {9}};
        int target = 6;
        int expected = 3;
        int actual = solution.binSearchRow(matrix, target);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void binSearchRowTest6() {
        int[][] matrix = new int[][]{{1}};
        int target = 0;
        int expected = -1;
        int actual = solution.binSearchRow(matrix, target);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void binSearchTest1() {
        int[] matrix = new int[]{1, 3, 4, 5, 7, 8, 9};
        int target = 1;
        assertThat(solution.binSearchNumber(matrix, target)).isTrue();
    }

    @Test
    void binSearchTest2() {
        int[] matrix = new int[]{1, 3, 4, 5, 7, 8, 9};
        int target = 2;
        assertThat(solution.binSearchNumber(matrix, target)).isFalse();
    }

    @Test
    void binSearchTest3() {
        int[] matrix = new int[]{1, 3, 4, 5, 7, 8, 9};
        int target = 6;
        assertThat(solution.binSearchNumber(matrix, target)).isFalse();
    }

    @Test
    void binSearchTest4() {
        int[] matrix = new int[]{1, 3, 4, 5, 7, 8, 9};
        int target = 9;
        assertThat(solution.binSearchNumber(matrix, target)).isTrue();
    }

    @Test
    void binSearchTest5() {
        int[] matrix = new int[]{1};
        int target = 1;
        assertThat(solution.binSearchNumber(matrix, target)).isTrue();
    }

    @Test
    void binSearchTest6() {
        int[] matrix = new int[]{1};
        int target =4;
        assertThat(solution.binSearchNumber(matrix, target)).isFalse();
    }

    @Test
    void binSearchTest7() {
        int[] matrix = new int[]{1};
        int target =0;
        assertThat(solution.binSearchNumber(matrix, target)).isFalse();
    }
}