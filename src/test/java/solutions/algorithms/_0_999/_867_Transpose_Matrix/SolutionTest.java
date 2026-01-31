package solutions.algorithms._0_999._867_Transpose_Matrix;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void transpose1() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] answer = solution.transpose(matrix);

        Assertions.assertThat(answer[0]).containsExactly(1, 4, 7);
        Assertions.assertThat(answer[1]).containsExactly(2, 5, 8);
        Assertions.assertThat(answer[2]).containsExactly(3, 6, 9);
    }

    @Test
    void transpose2() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}};

        int[][] answer = solution.transpose(matrix);

        Assertions.assertThat(answer[0]).containsExactly(1, 4);
        Assertions.assertThat(answer[1]).containsExactly(2, 5);
        Assertions.assertThat(answer[2]).containsExactly(3, 6);
    }
}