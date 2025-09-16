package solutions.algorithms._0_999._684_Redundant_Connection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findRedundantConnection1() {
        int[][] edges = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        int[] answer = solution.findRedundantConnection(edges);
        Assertions.assertThat(answer).isEqualTo(new int[]{2, 3});
    }

    @Test
    void findRedundantConnection2() {
        int[][] edges = new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        int[] answer = solution.findRedundantConnection(edges);
        Assertions.assertThat(answer).isEqualTo(new int[]{1, 4});
    }

    @Test
    void findRedundantConnection3() {
        int[][] edges = new int[][]{{1, 4}, {3, 4}, {1, 3}, {1, 2}, {4, 5}};
        int[] answer = solution.findRedundantConnection(edges);
        Assertions.assertThat(answer).isEqualTo(new int[]{1, 3});
    }

    @Test
    void findRedundantConnection4() {
        int[][] edges = new int[][]{{1, 5}, {3, 4}, {3, 5}, {4, 5}, {2, 4}};
        int[] answer = solution.findRedundantConnection(edges);
        Assertions.assertThat(answer).isEqualTo(new int[]{4, 5});
    }
}