package solutions.algorithms._3000_3999._3723_Maximize_Sum_of_Squares_of_Digits;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxSumOfSquares1() {
        int num = 2;
        int sum = 3;
        String answer = solution.maxSumOfSquares(num, sum);
        Assertions.assertThat(answer).isEqualTo("30");
    }

    @Test
    void maxSumOfSquares2() {
        int num = 2;
        int sum = 17;
        String answer = solution.maxSumOfSquares(num, sum);
        Assertions.assertThat(answer).isEqualTo("98");
    }

    @Test
    void maxSumOfSquares3() {
        int num = 1;
        int sum = 10;
        String answer = solution.maxSumOfSquares(num, sum);
        Assertions.assertThat(answer).isEqualTo("");
    }
}