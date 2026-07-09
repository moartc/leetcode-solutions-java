package solutions.algorithms._3000_3999._3532_Path_Existence_Queries_in_a_Graph_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void pathExistenceQueries1() {
        int n = 2;
        int[] nums = new int[]{1, 3};
        int maxDiff = 1;
        int[][] queries = new int[][]{{0, 0}, {0, 1}};
        boolean[] answer = solution.pathExistenceQueries(n, nums, maxDiff, queries);
        Assertions.assertThat(answer).containsExactly(true, false);
    }

    @Test
    void pathExistenceQueries2() {
        int n = 4;
        int[] nums = new int[]{2, 5, 6, 8};
        int maxDiff = 2;
        int[][] queries = new int[][]{{0, 1}, {0, 2}, {1, 3}, {2, 3}};
        boolean[] answer = solution.pathExistenceQueries(n, nums, maxDiff, queries);
        Assertions.assertThat(answer).containsExactly(false, false, true, true);
    }
}