package solutions.algorithms._3000_3999._3970_Shortest_Path_With_At_Most_K_Consecutive_Identical_Characters;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void shortestPath1() {
        int n = 3;
        int[][] edges = new int[][]{{0, 1, 1}, {1, 2, 1}, {0, 2, 3}};
        String labels = "aab";
        int k = 1;
        int answer = solution.shortestPath(n, edges, labels, k);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void shortestPath2() {
        int n = 3;
        int[][] edges = new int[][]{{0, 1, 1}, {1, 2, 1}, {0, 2, 3}};
        String labels = "aab";
        int k = 2;
        int answer = solution.shortestPath(n, edges, labels, k);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void shortestPath3() {
        int n = 3;
        int[][] edges = new int[][]{{0, 1, 1}, {1, 2, 1}};
        String labels = "aaa";
        int k = 2;
        int answer = solution.shortestPath(n, edges, labels, k);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void shortestPath4() {
        int n = 4;
        int[][] edges = new int[][]{{2, 3, 1955}, {3, 2, 7203}, {1, 3, 2094}};
        String labels = "jghk";
        int k = 2;
        int answer = solution.shortestPath(n, edges, labels, k);
        Assertions.assertThat(answer).isEqualTo(-1);
    }
}