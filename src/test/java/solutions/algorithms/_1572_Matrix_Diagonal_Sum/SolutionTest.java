package solutions.algorithms._1572_Matrix_Diagonal_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void diagonalSumTest1() {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int actual = solution.diagonalSum(mat);
        Assertions.assertThat(actual).isEqualTo(25);
    }

    @Test
    void diagonalSumTest2() {
        int[][] mat = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
        int actual = solution.diagonalSum(mat);
        Assertions.assertThat(actual).isEqualTo(8);
    }

    @Test
    void diagonalSumTest3() {
        int[][] mat = {{5}};
        int actual = solution.diagonalSum(mat);
        Assertions.assertThat(actual).isEqualTo(5);
    }
}