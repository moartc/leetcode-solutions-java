package solutions.algorithms._0_999._279_Perfect_Squares;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numSquares1() {
        int n = 12;
        int answer = solution.numSquares(n);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void numSquares2() {
        int n = 13;
        int answer = solution.numSquares(n);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}