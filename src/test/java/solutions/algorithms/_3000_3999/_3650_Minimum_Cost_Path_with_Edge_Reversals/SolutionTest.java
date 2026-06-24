package solutions.algorithms._3000_3999._3650_Minimum_Cost_Path_with_Edge_Reversals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minCost1() {
        int n = 4;
        int[][] edges = new int[][]{{0, 1, 3}, {3, 1, 1}, {2, 3, 4}, {0, 2, 2}};
        int answer = solution.minCost(n, edges);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void minCost2() {
        int n = 4;
        int[][] edges = new int[][]{{0, 2, 1}, {2, 1, 1}, {1, 3, 1}, {2, 3, 3}};
        int answer = solution.minCost(n, edges);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minCost3() {
        int n = 2;
        int[][] edges = new int[][]{{1, 0, 5}};
        int answer = solution.minCost(n, edges);
        Assertions.assertThat(answer).isEqualTo(10);
    }
}