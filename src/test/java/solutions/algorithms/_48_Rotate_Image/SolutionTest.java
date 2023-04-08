package solutions.algorithms._48_Rotate_Image;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rotateTest1() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expectedOutput = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};

        solution.rotate(matrix);

        Assertions.assertThat(matrix).isEqualTo(expectedOutput);
    }

    @Test
    void rotateTest2() {
        int[][] matrix = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] expectedOutput = new int[][]{{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};

        solution.rotate(matrix);

        Assertions.assertThat(matrix).isEqualTo(expectedOutput);
    }
}
