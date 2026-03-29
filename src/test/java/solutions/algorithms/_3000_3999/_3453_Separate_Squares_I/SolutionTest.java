package solutions.algorithms._3000_3999._3453_Separate_Squares_I;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void separateSquares1() {
        int[][] squares = new int[][]{{0, 0, 1}, {2, 2, 1}};
        double answer = solution.separateSquares(squares);
        Assertions.assertThat(answer).isEqualTo(1.00000, Offset.offset(1e-5));
    }

    @Test
    void separateSquares2() {
        int[][] squares = new int[][]{{0, 0, 2}, {1, 1, 1}};
        double answer = solution.separateSquares(squares);
        Assertions.assertThat(answer).isEqualTo(1.16667, Offset.offset(1e-5));
    }

    @Test
    void separateSquares3() {
        int[][] squares = new int[][]{{0, 1000000000, 1000000}};
        double answer = solution.separateSquares(squares);
        Assertions.assertThat(answer).isEqualTo(1000500000.0, Offset.offset(1e-5));
    }

    @Test
    void separateSquares4() {
        int[][] squares = new int[][]{{3, 26, 3}, {4, 30, 1}, {13, 27, 5}};
        double answer = solution.separateSquares(squares);
        Assertions.assertThat(answer).isEqualTo(28.81250, Offset.offset(1e-5));
    }


}