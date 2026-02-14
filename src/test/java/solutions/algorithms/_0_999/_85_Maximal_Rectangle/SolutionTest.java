package solutions.algorithms._0_999._85_Maximal_Rectangle;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximalRectangle1() {
        char[][] matrix = new char[][]{{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        int answer = solution.maximalRectangle(matrix);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void maximalRectangle2() {
        char[][] matrix = new char[][]{{'0'}};
        int answer = solution.maximalRectangle(matrix);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void maximalRectangle3() {
        char[][] matrix = new char[][]{{'1'}};
        int answer = solution.maximalRectangle(matrix);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void maximalRectangle4() {
        char[][] matrix = new char[][]{{'1', '1'}};
        int answer = solution.maximalRectangle(matrix);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maximalRectangle5() {
        char[][] matrix = new char[][]{{'0', '0', '0'}, {'0', '0', '0'}, {'1', '1', '1'}};
        int answer = solution.maximalRectangle(matrix);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maximalRectangle6() {
        char[][] matrix = new char[][]{
                {'0', '0', '0', '0', '0'},
                {'1', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int answer = solution.maximalRectangle(matrix);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}