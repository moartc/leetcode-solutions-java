package solutions.algorithms._0_999._51_N_Queens;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {

        List<List<String>> answer = solution.solveNQueens(4);

        Assertions.assertThat(answer).containsExactlyInAnyOrder(
                List.of(".Q..", "...Q", "Q...", "..Q."),
                List.of("..Q.", "Q...", "...Q", ".Q..")
        );
    }

    @Test
    void test2() {

        List<List<String>> answer = solution.solveNQueens(1);

        Assertions.assertThat(answer).containsExactlyInAnyOrder(
                List.of("Q")
        );
    }
}