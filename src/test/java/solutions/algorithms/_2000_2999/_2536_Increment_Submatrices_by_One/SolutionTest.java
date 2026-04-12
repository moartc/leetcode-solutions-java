package solutions.algorithms._2000_2999._2536_Increment_Submatrices_by_One;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void rangeAddQueries1() {
        int n = 3;
        int[][] queries = new int[][]{{1, 1, 2, 2}, {0, 0, 1, 1}};
        int[][] answer = solution.rangeAddQueries(n, queries);
        Assertions.assertThat(answer[0]).containsExactly(1, 1, 0);
        Assertions.assertThat(answer[1]).containsExactly(1, 2, 1);
        Assertions.assertThat(answer[2]).containsExactly(0, 1, 1);
    }

    @Test
    void rangeAddQueries2() {
        int n = 2;
        int[][] queries = new int[][]{{0, 0, 1, 1}};
        int[][] answer = solution.rangeAddQueries(n, queries);
        Assertions.assertThat(answer[0]).containsExactly(1, 1);
        Assertions.assertThat(answer[1]).containsExactly(1, 1);
    }
}