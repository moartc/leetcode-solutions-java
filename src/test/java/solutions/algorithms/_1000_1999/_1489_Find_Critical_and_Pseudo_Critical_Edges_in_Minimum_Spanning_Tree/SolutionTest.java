package solutions.algorithms._1000_1999._1489_Find_Critical_and_Pseudo_Critical_Edges_in_Minimum_Spanning_Tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findCriticalAndPseudoCriticalEdges1() {

        int n = 5;
        int[][] edges = new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 2}, {0, 3, 2}, {0, 4, 3}, {3, 4, 3}, {1, 4, 6}};

        List<List<Integer>> answer = solution.findCriticalAndPseudoCriticalEdges(n, edges);

        Assertions.assertThat(answer.get(0)).containsExactly(0, 1);
        Assertions.assertThat(answer.get(1)).containsExactly(2, 3, 4, 5);
    }

    @Test
    void findCriticalAndPseudoCriticalEdges2() {

        int n = 4;
        int[][] edges = new int[][]{{0, 1, 1}, {1, 2, 1}, {2, 3, 1}, {0, 3, 1}};

        List<List<Integer>> answer = solution.findCriticalAndPseudoCriticalEdges(n, edges);

        Assertions.assertThat(answer.get(0)).isEmpty();
        Assertions.assertThat(answer.get(1)).containsExactly(0, 1, 2, 3);
    }
}