package solutions.algorithms._1000_1999._1975_Maximum_Matrix_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxMatrixSum1() {
        int[][] matrix = new int[][]{{1, -1}, {-1, 1}};
        long answer = solution.maxMatrixSum(matrix);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maxMatrixSum2() {
        int[][] matrix = new int[][]{{1, 2, 3}, {-1, -2, -3}, {1, 2, 3}};
        long answer = solution.maxMatrixSum(matrix);
        Assertions.assertThat(answer).isEqualTo(16);
    }

    @Test
    void maxMatrixSum3() {
        /*
        =1  0 -1  = 2
        -2  1  3  = 6
         3  2  2  = 7

         */
        int[][] matrix = new int[][]{{-1,0,-1}, {-2,1,3}, {3,2,2}};
        long answer = solution.maxMatrixSum(matrix);
        Assertions.assertThat(answer).isEqualTo(15);
    }
}