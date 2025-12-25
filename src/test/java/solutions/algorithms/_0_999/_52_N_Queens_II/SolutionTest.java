package solutions.algorithms._0_999._52_N_Queens_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void totalNQueens1() {
        int answer = solution.totalNQueens(4);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void totalNQueens2() {
        int answer = solution.totalNQueens(1);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void totalNQueens3() {
        int answer = solution.totalNQueens(5);
        Assertions.assertThat(answer).isEqualTo(10);
    }
}