package solutions.algorithms._1000_1999._1727_Largest_Submatrix_With_Rearrangements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void largestSubmatrix1() {
        int[][] matrix = new int[][]{{0, 0, 1}, {1, 1, 1}, {1, 0, 1}};
        int answer = solution.largestSubmatrix(matrix);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void largestSubmatrix2() {
        int[][] matrix = new int[][]{{1, 0, 1, 0, 1}};
        int answer = solution.largestSubmatrix(matrix);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void largestSubmatrix3() {
        int[][] matrix = new int[][]{{1, 1, 0}, {1, 0, 1}};
        int answer = solution.largestSubmatrix(matrix);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}