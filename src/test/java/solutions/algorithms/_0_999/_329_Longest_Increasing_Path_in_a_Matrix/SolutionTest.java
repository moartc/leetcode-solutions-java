package solutions.algorithms._0_999._329_Longest_Increasing_Path_in_a_Matrix;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestIncreasingPath1() {
        int[][] matrix = new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        int answer = solution.longestIncreasingPath(matrix);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void longestIncreasingPath2() {
        int[][] matrix = new int[][]{{3, 4, 5}, {3, 2, 6}, {2, 2, 1}};
        int answer = solution.longestIncreasingPath(matrix);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void longestIncreasingPath3() {
        int[][] matrix = new int[][]{{1}};
        int answer = solution.longestIncreasingPath(matrix);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}