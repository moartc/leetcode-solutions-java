package solutions.algorithms._2000_2999._2747_Count_Zero_Request_Servers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countServers1() {
        int n = 3;
        int[][] logs = new int[][]{{1, 3}, {2, 6}, {1, 5}};
        int x = 5;
        int[] queries = new int[]{10, 11};
        int[] answer = solution.countServers(n, logs, x, queries);
        Assertions.assertThat(answer).containsExactly(1, 2);
    }

    @Test
    void countServers2() {
        int n = 3;
        int[][] logs = new int[][]{{2, 4}, {2, 1}, {1, 2}, {3, 1}};
        int x = 2;
        int[] queries = new int[]{3, 4};
        int[] answer = solution.countServers(n, logs, x, queries);
        Assertions.assertThat(answer).containsExactly(0, 1);
    }
}